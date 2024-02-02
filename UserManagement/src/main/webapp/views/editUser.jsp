<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>    
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
  <body bgcolor="pink">
        <h1>Edit User Details Here</h1>  
       <form:form method="GET" action="/editandSave">    
        <table >    
        <tr>  
        <td></td>    
         <td><form:hidden path="id" /></td>  
         </tr>  
         <tr>    
            <td>Name :</td>    
            <td><form:input path="name" /></td>  
           </tr>  
         <tr>    
          <td>Password : </td>   
          <td><form:input path="password"  /></td>  
         </tr>  
         <tr>    
          <td>Eamil :</td>    
          <td><form:input path="email" /></td>  
         </tr> 
         <tr>    
            <td>Gender :</td>    
            <td><form:input path="gender" /></td>  
           </tr>  
           <tr>    
            <td>Country :</td>    
            <td><form:input path="country" /></td>  
           </tr>   
         <tr>    
          <td> </td>    
          <td><input type="submit" value="EditSave" /></td>    
         </tr>    
        </table>    
       </form:form>  
      
       </body>


