<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
    <head>
        <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <meta name="description" content="">
    <meta name="author" content="">

    <title>IMS</title>

    
    <link rel="stylesheet" href="css/bootstrap.min.css" type="text/css">

   
    <link href='http://fonts.googleapis.com/css?family=Open+Sans:300italic,400italic,600italic,700italic,800italic,400,300,600,700,800' rel='stylesheet' type='text/css'>
    <link href='http://fonts.googleapis.com/css?family=Merriweather:400,300,300italic,400italic,700,700italic,900,900italic' rel='stylesheet' type='text/css'>
    <link rel="stylesheet" href="font-awesome/css/font-awesome.min.css" type="text/css">

    
    <link rel="stylesheet" href="css/animate.min.css" type="text/css">

    
    <link rel="stylesheet" href="css/creative.css" type="text/css">
   <script src="js/jquery.js"></script>

    <!-- Bootstrap Core JavaScript -->
    <script src="js/bootstrap.min.js"></script>

    <!-- Plugin JavaScript -->
    
            
    </head>
    <body>
       
        <%@include file="admin_nav_bar.jsp" %>
        <form class="form-horizontal" action="Insert_company" method="post">
<fieldset>

<div class="container" style="margin-top:50px"> 
<legend><h2>Internship Type - Company</h2> </legend>

</div>


                     
<center> <h3 class="text-primary"> Company Details</h3></center>
                  
<div class="form-group">
  <label class="col-md-4 control-label" for="id">Company name</label>  
  <div class="col-md-4">
  <input id="id" name="c_name" type="text" placeholder="Company name" class="form-control input-md" required="">
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="fn">Address</label>  
  <div class="col-md-4">
  <input id="fn" name="c_address" type="text" placeholder="Address" class="form-control input-md" required="">
    
  </div>
</div>

<!-- Text input-->
<div class="form-group">
  <label class="col-md-4 control-label" for="fn">City</label>  
  <div class="col-md-4">
  <input id="fn" name="c_city" type="text" placeholder="city" class="form-control input-md" required="">
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="fn">Postal code</label>  
  <div class="col-md-4">
  <input id="fn" name="c_postalcode" type="text" placeholder="Postal code" class="form-control input-md" required="">
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="fn">Country</label>  
  <div class="col-md-4">
  <input id="fn" name="c_country" type="text" placeholder="country" class="form-control input-md" required="">
    
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">First Name</label>  
  <div class="col-md-4">
      
  <input name="c_f_name" type="text" placeholder="First name" class="form-control input-md" required="">
     
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">Last Name</label>  
  <div class="col-md-4">
      
  <input name="c_l_name" type="text" placeholder="Last name" class="form-control input-md" required="">
     
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">Position</label>  
  <div class="col-md-4">
      
  <input name="c_position" type="text" placeholder="position in company" class="form-control input-md" required="">
     
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">Telephone</label>  
  <div class="col-md-4">
      
  <input name="c_telephone" type="text" placeholder="telephone" class="form-control input-md" required="">
     
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">Email</label>  
  <div class="col-md-4">
      
  <input name="c_email" type="text" placeholder="email" class="form-control input-md" required="">
     
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">Company Website</label>  
  <div class="col-md-4">
      
  <input name="c_website" type="text" placeholder="company website" class="form-control input-md" required="">
     
  </div>
</div>

<div class="form-group">
  <label class="col-md-4 control-label" for="mn">Notes</label>  
  <div class="col-md-4">
      
      <textarea rows="4" input name="c_notes" placeholder="Company details" class="form-control"></textarea>
     
  </div>
</div>

<center>
<div class="form-group">
  <label class="col-md-4 control-label" for="submit"></label>
  <div class="col-md-4">
    <button id="submit" name="submit" class="btn btn-primary">SUBMIT</button>
  </div>
</div>
</center>
</fieldset>
</form>
        
        
        
        
        
        
        
        <%@include file="footer.jsp" %>
        
           </body>
</html>