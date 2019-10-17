<%@ include file="./header.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<div class="alert alert-info">
	<h3>${title}</h3>
</div>
<table class="table table-bordered table-striped table-hover">
	<thead>
		<tr>
			<th>Picture</th>
			<th>Name</th>
			<th>Quantity Per Unit</th>
			<th>Unit Price</th>
		</tr>
	</thead>
	<tbody>
		<c:forEach items="${products}" var="p">
			<tr>
				<td><img src="${p.picture}" style="height: 50px;"
					alt="${p.name}"></td>
				<td>
				<a href="./edit-product?id=${p.id}"><i class="fa fa-pencil"></i></a>
				<span style="width: 20px; display: inline-block"></span>
				<a href="./delete-product?id=${p.id}"><i class="fa fa-trash-o text-right"></i></a>
				<span style="width: 20px; display: inline-block"></span>
				<a href="./view-product-details?id=${p.id}"> ${p.description} </a>
				</td>
				<td>${p.quantityPerUnit}</td>
				<td>${p.unitPrice}</td>
			</tr>
		</c:forEach>
	</tbody>
</table>
<%@ include file="./footer.jsp"%>