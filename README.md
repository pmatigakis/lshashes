The lshashes library provides implementation os of several locally sensitive hashes.
The following hash functions are available.

* TLSH (https://documents.trendmicro.com/assets/wp/wp-locality-sensitive-hash.pdf)

## Examples

### TLSH

```java
import com.matigakis.lshashes.hashes.tlsh.Data;
import com.matigakis.lshashes.hashes.tlsh.Text;
import com.matigakis.lshashes.hashes.tlsh.Tlsh;
import com.matigakis.lshashes.hashes.tlsh.TlshCalculator;

public class Hello {
    public static void main(String[] args) {
        Data data = Text.create(
                "Lorem ipsum dolor sit amet, consectetur " +
                "adipiscing elit. Sed congue pharetra cursus. Mauris eu " +
                "semper ante, vel faucibus leo. Interdum et malesuada fames " +
                "ac ante ipsum primis in faucibus");

        TlshCalculator calculator = TlshCalculator.create();
        Tlsh tlsh = calculator.calculate(data);

        System.out.println(tlsh.toHex());
   }
}
```
