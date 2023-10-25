package com.harsh.controller;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.harsh.exception.OrderException;
import com.harsh.exception.UserException;
import com.harsh.model.Order;
import com.harsh.repository.OrderRepository;
import com.harsh.response.ApiResponse;
import com.harsh.response.PaymentLinkResponse;
import com.harsh.service.OrderService;
import com.harsh.service.UserService;
import com.razorpay.PaymentLink;
import com.razorpay.RazorpayClient;
import com.razorpay.RazorpayException;

@RestController
@RequestMapping("/api")
public class PaymentController {
	
	private OrderService orderService;
	private UserService userService;
	private OrderRepository orderRepository;
	
	public PaymentController(OrderService orderService,UserService userService,OrderRepository orderRepository) {
		this.orderService=orderService;
		this.userService=userService;
		this.orderRepository=orderRepository;
	}
	
	@PostMapping("/payments/{orderId}")
	public ResponseEntity<PaymentLinkResponse>createPaymentLink(@PathVariable Long orderId,
			@RequestHeader("Authorization")String jwt) 
					throws RazorpayException, UserException, OrderException{
		RazorpayClient razorpay = new RazorpayClient("rzp_test_kTsRSaDC8hwztX", "LieoD1s9mxMIv569PcgRDMcU");
		Order order=orderService.findOrderById(orderId);
		JSONObject paymentLinkRequest = new JSONObject();
		paymentLinkRequest.put("amount",order.getTotalPrice()* 100);
		paymentLinkRequest.put("currency","INR");
		PaymentLink payment = razorpay.paymentLink.create(paymentLinkRequest);

		String paymentLinkId = payment.get("id");
		String paymentLinkUrl = payment.get("short_url");

		PaymentLinkResponse res=new PaymentLinkResponse(paymentLinkUrl,paymentLinkId);

		PaymentLink fetchedPayment = razorpay.paymentLink.fetch(paymentLinkId);

		order.setOrderId(fetchedPayment.get("order_id"));
		orderRepository.save(order);

		// Print the payment link ID and URL
		System.out.println("Payment link ID: " + paymentLinkId);
		System.out.println("Payment link URL: " + paymentLinkUrl);
		System.out.println("Order Id : "+fetchedPayment.get("order_id")+fetchedPayment);

		return new ResponseEntity<PaymentLinkResponse>(res,HttpStatus.ACCEPTED);
		
		
//		order_id
	}
	
  @GetMapping("/payments")
  public ResponseEntity<ApiResponse> redirect(@RequestParam(name="payment_id") String paymentId,@RequestParam("order_id")Long orderId) throws RazorpayException, OrderException {
	  Order order =orderService.findOrderById(orderId);
	

		ApiResponse res=new ApiResponse("your order get placed", true);
	      return new ResponseEntity<ApiResponse>(res,HttpStatus.OK);

  }

}
