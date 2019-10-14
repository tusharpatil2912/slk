<%@ include file="./dashboard-header.jsp"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Dashboard</h1>

	<div class="jumbotron">
				<div class="col-md-11 col-sm-11">
					<div class="container">
					<div class="row">
					<div class="col-sm-11">
						<h1>Welcome ${user.name}</h1><br>
					</div>	
						<div class="col-sm-11">
							<p class="lead">Name : ${user.name}</p>
							<p class="lead">Gender : ${user.gender}</p>
							<p class="lead">Email : ${user.email}</p>
							<p class="lead">Phone : ${user.phone}</p>
						</div>
						</div>
					</div>
				</div>
		</div>
 
<%@ include file="./footer.jsp"%>