const albumsList = document.getElementById('albumsList')
const searchBar = document.getElementById('searchInput')

const allAlbums = [];

fetch("http://localhost:8080/albums/api").
  then(response => response.json()).
  then(data => {
    for (let album of data) {
      allAlbums.push(data)
    }
})

//TODO: add key listener to the search

//TODO: create method that adds an album...
