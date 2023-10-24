import React from "react";
import Carousel from "../../components/HomeCarousel/MainCarousel";
import HomeSectionCarousel from "../../components/HomeSectionCarousel/HomeSectionCarousel";

const Homepage = () => {
  return (
    <div>
      <Carousel />
      <div>
        <HomeSectionCarousel />
      </div>
    </div>
  );
};

export default Homepage;
