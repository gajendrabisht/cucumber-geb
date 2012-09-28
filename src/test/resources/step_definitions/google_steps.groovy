import com.example.Google

this.metaClass.mixin(cucumber.runtime.groovy.Hooks)
this.metaClass.mixin(cucumber.runtime.groovy.EN)
this.metaClass.mixin(geb.Browser)

Given(~'a User is at Google home page') { ->
	to Google
	at Google
}

When(~'the User searches for "([^"]+)"') { String searchTerm ->
	searchFor(searchTerm)
}

Then(~'the User should see first result as a wiki article about "([^"]+)"') { String wikiArticleTopic ->
    searchResultIs(1, 'Caramel - Wikipedia, the free encyclopedia')
}