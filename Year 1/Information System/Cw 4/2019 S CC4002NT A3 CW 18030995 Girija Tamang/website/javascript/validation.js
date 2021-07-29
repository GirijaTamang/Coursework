function validation(){
  var name = document.getElementById("N").value;
  var address = document.getElementById("A").value;
  var phone = document.getElementById("P").value;
  var email = document.getElementById("E").value;
  var message = document.getElementById("M").value;
  
  //checking condition if enter name length is five or not
  if(name.length < 5){
    alert("First filled out your full name");
    return false;
  }
//if the value  of address is less than one show error message
  if(address.length < 1){
    alert("Please Enter your address");
    return false;
  }
  //isNAN is used to check the input data is number or not 
  if(isNaN(phone) || phone.length != 10){
  alert("Please Enter valid phone number");
    return false;
  }
  //checking whether there something infront of @ or not
  if(email.indexOf("@") == -1 || email.length < 6){
    alert("Please  Enter valid  email address (Example:ram@email.com)");
    return false;
  }
 
  if(message.length <= 3){
    alert("Please write Comment !!! ");
    return false;
  }
  //if all date are enter correction pop up message shows
  alert("Order Done Successfully! We will Contact You Soon");
  return true;
}