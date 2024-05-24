import { Grid, Rating, Typography } from "@mui/material";
import React from "react";

const RestaurantLabelLargePicture= ({ restaurant, handleRestaurantClick }) => {
 const rating = restaurant.rating ? restaurant.rating : (Math.random() * (4.9 - 3.9) + 3.9).toFixed(1)
  return (
    <Grid container item key={restaurant.id} onClick={() => handleRestaurantClick(restaurant)}>
      <Grid container item justifyContent="space-between" >
        <Grid  item sx={{ flexGrow: 3, marginRight: 1 }} style={{ height: "100px", width: "160px" }}  >
          <img src={restaurant.pictureUrl1} alt={restaurant.name}
               style={{ height: "200px", width: "320px", borderTopLeftRadius: "10px", borderBottomLeftRadius: "10px" }} />
        </Grid>
        <Grid  item sx={{ flexGrow: 1, marginRight: 1 }}>
          <Grid item >
            <img src={restaurant.menuDtoList[0].pictureUrl} alt={restaurant.name}
                 style={{ width: 162, height: 100, borderTopRightRadius: "10px" }} />
          </Grid>
          <Grid item >
            <img src={restaurant.menuDtoList[1].pictureUrl} alt={restaurant.name}
                 style={{ width: 162, height: 100, borderBottomRightRadius: "10px" }} />
          </Grid>
        </Grid>
      </Grid>
      <Grid container spacing={2} alignItems="center">

        <Grid item xs={8}>
          <Typography variant="subtitle1" align="left">{restaurant.name}</Typography>
          <Grid container alignItems="center" spacing={0.5}>
            <Grid item>
              <Rating name="half-rating" defaultValue={rating} precision={0.1} max={5} />
            </Grid>
            <Grid item>
              <Typography variant="body2">{rating}</Typography>
            </Grid>
          </Grid>
          <Grid container item alignItems="center" spacing={2}>
            <Grid item>
              <Typography variant="body2" color="text.secondary">
                {restaurant.distance ? restaurant.distance : (Math.random() * (4.9 - 3.9) + 3.9).toFixed(1)} km
              </Typography>
            </Grid>
            <Grid item>
              <Typography variant="body2" color="text.secondary">
                {restaurant.deliveryTime ?? Math.floor(Math.random() * (60 - 20) + 20)} 분
              </Typography>
            </Grid>
            <Grid item>
              <Typography variant="body2" color="text.secondary">
                배달팁 {restaurant.deliveryFee ?? Math.floor((Math.random() * (5000 - 2000) + 2000) / 100) * 100} 원
              </Typography>
            </Grid>
          </Grid>
        </Grid>
      </Grid>
    </Grid>
  );
};

export default RestaurantLabelLargePicture;