package grails.gson.not.found

class TestController {
	static responseFormats = ['json', 'xml']
	
    def show() {
        def test = new Test(message: new Message(value: "should be uppercase"))
        respond test
    }
}
