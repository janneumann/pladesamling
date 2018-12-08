<%-- 
    Document   : navbar
    Created on : 08-12-2018, 13:02:38
    Author     : JNE
--%>

<%@page import="logic.User"%>
<nav class="navbar navbar-default">
  <div class="container-fluid">

      <form class="navbar-form navbar-left">
        <div class="form-group">
          <input type="text" class="form-control" placeholder="User name">
          <input type="text" class="form-control" placeholder="Password">
        </div>
        <button type="submit" class="btn btn-default">Log in</button>
      </form>
      <ul class="nav navbar-nav navbar-right">
          <%if(request.getAttribute("user")!=null){
              User user1 = (User)request.getAttribute("user");
              out.print("<li><a>Logged in as: "+user1.getName()+"</a></li>");
          }
              
          %>

      </ul>
  </div><!-- /.container-fluid -->
</nav>

