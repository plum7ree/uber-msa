import React from "react";
import {BrowserRouter as Router, Link, Route, Routes} from "react-router-dom";
import "./styles.css";
import UberLikeApp from "./UberLikeApp";
import EatsMain from "./eats/EatsMain";
import {Box, Grid, Typography} from "@mui/material";
import {styled} from "@mui/material/styles";
import {FaCar, FaUtensils} from "react-icons/fa";
import MyPage from "./eats/MyPage";
import RestaurantRegistration from "./eats/RestaurantRegistration";
import RestaurantManage from "./eats/RestaurantManage";
import RestaurantList from "./eats/RestaurantList";
import RestaurantPage from "./eats/RestaurantPage";
import MenuPage from "./eats/MenuPage";

const IconContainer = styled(Box)({
   display: "flex",
   justifyContent: "center",
   alignItems: "center",
   // height: "100vh",
});

const IconLink = styled(Link)({
   display: "flex",
   flexDirection: "column",
   alignItems: "center",
   textDecoration: "none",
   color: "#000",
   margin: "0 20px",
   padding: "20px",
   borderRadius: "25px",
   border: "2px solid #fff",
   transition: "background-color 0.3s ease",
   "&:hover": {
      backgroundColor: "rgba(0, 0, 0, 0.1)",
   },
});

const IconWrapper = styled(Box)({
   fontSize: "7rem",
   marginBottom: "10px",
});

export default function App() {
   return (
      <div className="App">
         <Router>
            <Routes>
               <Route
                  path="/"
                  element={
                     <Grid container display="flex" justifyContent="center" alignItems="center">
                        <Grid container style={{justifyContent: "flex-center", flexDirection: "column"}}>
                           <Typography style={{fontSize: "2.5rem", fontWeight: "bold", marginBottom: "2rem"}}>
                              Choose a Service
                           </Typography> </Grid>
                        <Grid container style={{justifyContent: "flex-end", flexDirection: "column"}}>
                           <IconContainer>

                              <IconLink to="/uber">
                                 <IconWrapper>
                                    <FaCar/>
                                 </IconWrapper>
                                 <Typography variant="h5">Taxi</Typography>
                              </IconLink>
                              <IconLink to="/eats">
                                 <IconWrapper>
                                    <FaUtensils/>
                                 </IconWrapper>
                                 <Typography variant="h5">Delivery</Typography>
                              </IconLink>
                           </IconContainer>

                        </Grid>
                     </Grid>
                  }
               />
               <Route path="/uber" element={<UberLikeApp/>}/>
               <Route path="/eats" element={<EatsMain/>}/>
               <Route path="/eats/mypage" element={<MyPage/>}/>
               <Route path="/eats/restaurant-registration" element={<RestaurantRegistration/>}/>
               <Route path="/eats/restaurant-manage" element={<RestaurantManage/>}/>
               <Route path="/eats/restaurants/:type" element={<RestaurantList/>}/>
               <Route path="/eats/restaurant/restaurant-page"
                      element={<RestaurantPage/>}/> {/* 레스토랑 페이지를 라우터에 등록합니다. */}
               <Route path="/eats/restaurant/menu" element={<MenuPage/>}/>
            </Routes>
         </Router>
      </div>
   );
}