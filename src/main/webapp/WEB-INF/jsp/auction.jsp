





















<div class="cover-container justify-content-center float-md-end">
	<header class="mb-auto">
		<div>
			<nav class="nav nav-masthead justify-content-center float-md-end">
			<a class="nav-link text-whit active" aria-current="page" href="/">HOME</a>
			<a class="nav-link text-whit active" aria-current="page" href="/">Inventory</a>
			<a class="nav-link text-whit active" aria-current="page" href="/">About</a>
			<a class="nav-link text-whit active" aria-current="page" href="/">Search</a>
			</nav>
		</div>
	</header>
	
	<main class ="px-3">
	<h1 class="text-white display 2"> Saunders Automotive</h1>
	<p class="Lead text-white"> Always the BEST!!!!"</p>
	</main>
	
	<p>
		<br> Image:
		<c:out value="${listing.vehicle.image}" />
		<br>Make
		<c:out value="${listing.vehicle.make}" />
		<br>Model
		<c:out value="${listing.vehicle.model}" />
		<br>Price
		<c:out value="${listing.vehicle.price}" />
		<br>Description
		<c:out value="${listing.vehicle.description}" />
		<br>Year
		<c:out value="${listing.vehicle.year}" />
		<br>Color
		<c:out value="${listing.vehicle.color}" />
		<br>Mileage
		<c:out value="${listing.vehicle.mileage}" />
		<br>Vin
		<c:out value="${listing.vehicle.Vin}" />
		<br>
		</p>
		
		
</div>



</body>
</html>