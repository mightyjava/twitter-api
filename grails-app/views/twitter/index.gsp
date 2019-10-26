<!doctype html>
<html>
    <head>
        <meta name="layout" content="main"/>
        <title>Twitter API</title>
    </head>
    <body>
        <nav class="navbar navbar-default navbar-fixed-top">
            <div class="container-fluid">
                <div class="navbar-header">
                    <a class="navbar-brand">
                        <img alt="Logo" src="https://uploads.filipeflop.com/2016/10/twitter-logo.png" width="150" height="45" style="margin-top: -8px;"/>
                    </a>
                </div>
                <div class="navbar-text navbar-right" style="margin-bottom: 15px;margin-right: 0px;">
                    <button class="btn btn-default btn-sm" type="button" id="saveTweet">Save Tweets</button>
                </div>
            </div>
        </nav>
        <div class="container" style="margin-top: 63px;">
            <h1 class="text-center"><b>Welcome to Twitter Search API</b></h1><br/>
            <div class="input-group input-group-lg">
                <span class="input-group-addon">
                    <img src="https://www.bh-bims.org/wp-content/uploads/2017/12/twitter-icon-white-e1513102680550.png" width="25"/>&nbsp;&nbsp;
                </span>
                <input type="text" class="form-control" id="searchText" placeholder="Search any text or #Tag">
                <span class="input-group-btn">
                    <button class="btn btn-default" type="button" id="searchTweet">Search</button>
                </span>
            </div>
            <br/>
        </div>
        <div id="searchedTweet">
            <div class="col-lg-12 text-center" style="margin-top:-15px;"><h3>No tweets available. Please search...</h3></div>
        </div>
    </body>
    <asset:javascript src="jquery.twitter.js"/>
</html>
