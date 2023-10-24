import logo from "./logo.svg";
import "./App.css";
import Example from "./customer/components/Navigation/navigation";
import Homepage from "./customer/pages/homepage/homepage";
import HomeSectionCarousel from "./customer/components/HomeSectionCarousel/HomeSectionCarousel";
function App() {
  return (
    <div className="App">
      <Example />
      <div>
        <Homepage />
      </div>
    </div>
  );
}

export default App;
