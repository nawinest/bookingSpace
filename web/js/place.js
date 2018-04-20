function initMap() {
    var uluru = { lat: 13.736717, lng: 100.523186 };
    map = new google.maps.Map(document.getElementById('map'), {
        zoom: 17,
        center: uluru

    });
    var marker = new google.maps.Marker({
        position: uluru,
        map: map,
        // draggable: true
    });

}