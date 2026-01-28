UserDetails={

    id:101,name:"Paras"


};
// console.log(UserDetails);
console.log(UserDetails.id);// to get the property
UserDetails.mobileNo=81900383; //to add new property
UserDetails.name="xyz"; // to update new property
delete UserDetails.id; // to delete the property
console.log(UserDetails);
