// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.scdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.scdn.inputs.GetDomainsArgs;
import com.pulumi.alicloud.scdn.inputs.GetDomainsPlainArgs;
import com.pulumi.alicloud.scdn.outputs.GetDomainsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class ScdnFunctions {
    /**
     * This data source provides the Scdn Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.scdn.ScdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var nameRegex = ScdnFunctions.getDomains(GetDomainsArgs.builder()
     *             .nameRegex(&#34;^my-Domain&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;scdnDomainId&#34;, nameRegex.applyValue(getDomainsResult -&gt; getDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDomainsResult> getDomains() {
        return getDomains(GetDomainsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Scdn Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.scdn.ScdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var nameRegex = ScdnFunctions.getDomains(GetDomainsArgs.builder()
     *             .nameRegex(&#34;^my-Domain&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;scdnDomainId&#34;, nameRegex.applyValue(getDomainsResult -&gt; getDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainsResult> getDomainsPlain() {
        return getDomainsPlain(GetDomainsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Scdn Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.scdn.ScdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var nameRegex = ScdnFunctions.getDomains(GetDomainsArgs.builder()
     *             .nameRegex(&#34;^my-Domain&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;scdnDomainId&#34;, nameRegex.applyValue(getDomainsResult -&gt; getDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDomainsResult> getDomains(GetDomainsArgs args) {
        return getDomains(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Scdn Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.scdn.ScdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var nameRegex = ScdnFunctions.getDomains(GetDomainsArgs.builder()
     *             .nameRegex(&#34;^my-Domain&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;scdnDomainId&#34;, nameRegex.applyValue(getDomainsResult -&gt; getDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainsResult> getDomainsPlain(GetDomainsPlainArgs args) {
        return getDomainsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Scdn Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.scdn.ScdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var nameRegex = ScdnFunctions.getDomains(GetDomainsArgs.builder()
     *             .nameRegex(&#34;^my-Domain&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;scdnDomainId&#34;, nameRegex.applyValue(getDomainsResult -&gt; getDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDomainsResult> getDomains(GetDomainsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:scdn/getDomains:getDomains", TypeShape.of(GetDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Scdn Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.131.0+.
     * 
     * ## Example Usage
     * 
     * Basic Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.scdn.ScdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
     * import java.util.List;
     * import java.util.ArrayList;
     * import java.util.Map;
     * import java.io.File;
     * import java.nio.file.Files;
     * import java.nio.file.Paths;
     * 
     * public class App {
     *     public static void main(String[] args) {
     *         Pulumi.run(App::stack);
     *     }
     * 
     *     public static void stack(Context ctx) {
     *         final var nameRegex = ScdnFunctions.getDomains(GetDomainsArgs.builder()
     *             .nameRegex(&#34;^my-Domain&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;scdnDomainId&#34;, nameRegex.applyValue(getDomainsResult -&gt; getDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDomainsResult> getDomainsPlain(GetDomainsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:scdn/getDomains:getDomains", TypeShape.of(GetDomainsResult.class), args, Utilities.withVersion(options));
    }
}
