package famcation

import groovy.transform.CompileStatic
import io.micronaut.runtime.Micronaut

@CompileStatic
class FamcationApplication {
    static void main(String[] args) {
        Micronaut.run(FamcationApplication)
    }
}
