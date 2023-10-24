import React from "react";
import AliceCarousel from "react-alice-carousel";
import "react-alice-carousel/lib/alice-carousel.css";
import { mensShoesPage1 } from "../../../ecommerce-products-data/shoes";

const responsive = {
  0: { items: 1 },
  568: { items: 2 },
  1024: { items: 3 },
};

const Carousel = () => {
  // const navigate = useNavigate()
  const items = mensShoesPage1.map((item) => (
    <img
      className="cursor-pointer"
      src={item.image}
      role="presentation"
      alt="/"
    />
  ));
  return (
    <AliceCarousel
      mouseTracking
      items={items}
      disableButtonsControls
      autoPlay
      autoPlayInterval={1000}
      infinite
    />
  );
};
export default Carousel;
