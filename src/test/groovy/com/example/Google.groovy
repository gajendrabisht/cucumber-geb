package com.example

import geb.Page

class Google extends Page {
	
	static url = 'http://www.google.co.uk/'

	static at = {
        assert title == 'Google'
    }
	
	static content = {
		searchInput { $('input', name: 'q') }
		searchButton { $('button', name: 'btnG') }
	}
	
	void searchFor(String searchTerm) {
		searchInput.value(searchTerm)
		searchButton.click()
	}

    void searchResultIs(def index, def title) {
        waitFor {
            $('div#ires ol li')[index - 1].find('a').text() == title
        }
    }

}
