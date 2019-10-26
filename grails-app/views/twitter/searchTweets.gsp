<g:each in="${tweets}" var="tweet">
    <div class="col-lg-3">
        <div class="panel panel-info">
            <div class="panel-heading">
                <span>
                    <img class="img-rounded" src="${tweet.profileImageUrl}" width="30" height="30"/>
                    <g:if test="${tweet.userName.length() > 30}">
                        ${tweet.userName.capitalize().substring(0, 30)}..
                    </g:if>
                    <g:else>
                        ${tweet.userName.capitalize()}
                    </g:else>
                </span>
                <span class="badge pull-right">${tweet.retweetCount}, Retweet</span>
            </div>
            <div class="panel-body" style="height:120px; overflow: auto;">
                ${tweet.unmodifiedText}
            </div>
            <div class="panel-footer">
                <g:if test="${tweet.location}">
                    <span class="label label-info text-capitalize">${tweet.location}</span>
                </g:if>
                <g:else>
                    <span class="label label-danger text-capitalize">Unknown</span>
                </g:else>
                <span class="pull-right"><g:formatDate format="dd-MMM-yyyy" date="${tweet.createdAt}"/></span>
            </div>
        </div>
    </div>
</g:each>