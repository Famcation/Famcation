package famcation

import groovy.transform.CompileStatic
import io.micronaut.http.HttpResponse
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import io.micronaut.views.View

@CompileStatic
@Controller("/beer")
class BeerController {
    @View("beer")
    @Get("/")
    HttpResponse<LinkedHashMap> index() {
        return HttpResponse.ok([test: true])
    }
}
