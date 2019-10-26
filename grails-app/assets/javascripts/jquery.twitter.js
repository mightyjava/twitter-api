$(document).ready(function () {
   $("#searchTweet").click(function() {
       var searchText = $("#searchText").val();
       if(searchText.charAt(0) == "#") {
           searchText = searchText.substring(1);
       }
       $.ajax({
           type : "GET",
           url : "/twitter/searchTweets?query="+searchText,
           success : function(data) {
               $("#searchedTweet").html(data);
           }
       });
   });

   $("#saveTweet").click(function () {
       $.ajax({
           type : "GET",
           url : "/twitter/saveTweets?query="+$("#searchText").val(),
           success : function(data) {
               alert(data.message);
           }
       });
   });
});