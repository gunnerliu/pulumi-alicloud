// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.mhub;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.mhub.inputs.GetAppsArgs;
import com.pulumi.alicloud.mhub.inputs.GetAppsPlainArgs;
import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
import com.pulumi.alicloud.mhub.inputs.GetProductsPlainArgs;
import com.pulumi.alicloud.mhub.outputs.GetAppsResult;
import com.pulumi.alicloud.mhub.outputs.GetProductsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class MhubFunctions {
    /**
     * This data source provides the Mhub Apps of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.App;
     * import com.pulumi.alicloud.mhub.AppArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetAppsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new App(&#34;default&#34;, AppArgs.builder()        
     *             .appName(name)
     *             .productId(alicloud_mhub_product.default().id())
     *             .packageName(&#34;com.test.android&#34;)
     *             .type(&#34;2&#34;)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getApps();
     * 
     *         ctx.export(&#34;mhubAppId1&#34;, ids.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *         final var nameRegex = MhubFunctions.getApps(GetAppsArgs.builder()
     *             .nameRegex(&#34;^my-App&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubAppId2&#34;, nameRegex.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAppsResult> getApps(GetAppsArgs args) {
        return getApps(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Mhub Apps of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.App;
     * import com.pulumi.alicloud.mhub.AppArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetAppsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new App(&#34;default&#34;, AppArgs.builder()        
     *             .appName(name)
     *             .productId(alicloud_mhub_product.default().id())
     *             .packageName(&#34;com.test.android&#34;)
     *             .type(&#34;2&#34;)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getApps();
     * 
     *         ctx.export(&#34;mhubAppId1&#34;, ids.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *         final var nameRegex = MhubFunctions.getApps(GetAppsArgs.builder()
     *             .nameRegex(&#34;^my-App&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubAppId2&#34;, nameRegex.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppsResult> getAppsPlain(GetAppsPlainArgs args) {
        return getAppsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Mhub Apps of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.App;
     * import com.pulumi.alicloud.mhub.AppArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetAppsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new App(&#34;default&#34;, AppArgs.builder()        
     *             .appName(name)
     *             .productId(alicloud_mhub_product.default().id())
     *             .packageName(&#34;com.test.android&#34;)
     *             .type(&#34;2&#34;)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getApps();
     * 
     *         ctx.export(&#34;mhubAppId1&#34;, ids.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *         final var nameRegex = MhubFunctions.getApps(GetAppsArgs.builder()
     *             .nameRegex(&#34;^my-App&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubAppId2&#34;, nameRegex.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAppsResult> getApps(GetAppsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:mhub/getApps:getApps", TypeShape.of(GetAppsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Mhub Apps of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.App;
     * import com.pulumi.alicloud.mhub.AppArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetAppsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new App(&#34;default&#34;, AppArgs.builder()        
     *             .appName(name)
     *             .productId(alicloud_mhub_product.default().id())
     *             .packageName(&#34;com.test.android&#34;)
     *             .type(&#34;2&#34;)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getApps();
     * 
     *         ctx.export(&#34;mhubAppId1&#34;, ids.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *         final var nameRegex = MhubFunctions.getApps(GetAppsArgs.builder()
     *             .nameRegex(&#34;^my-App&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubAppId2&#34;, nameRegex.applyValue(getAppsResult -&gt; getAppsResult.apps()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppsResult> getAppsPlain(GetAppsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:mhub/getApps:getApps", TypeShape.of(GetAppsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Mhub Products of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.Product;
     * import com.pulumi.alicloud.mhub.ProductArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new Product(&#34;default&#34;, ProductArgs.builder()        
     *             .productName(name)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getProducts();
     * 
     *         ctx.export(&#34;mhubProductId1&#34;, ids.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *         final var nameRegex = MhubFunctions.getProducts(GetProductsArgs.builder()
     *             .nameRegex(&#34;^my-Product&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubProductId2&#34;, nameRegex.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetProductsResult> getProducts() {
        return getProducts(GetProductsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Mhub Products of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.Product;
     * import com.pulumi.alicloud.mhub.ProductArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new Product(&#34;default&#34;, ProductArgs.builder()        
     *             .productName(name)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getProducts();
     * 
     *         ctx.export(&#34;mhubProductId1&#34;, ids.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *         final var nameRegex = MhubFunctions.getProducts(GetProductsArgs.builder()
     *             .nameRegex(&#34;^my-Product&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubProductId2&#34;, nameRegex.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductsResult> getProductsPlain() {
        return getProductsPlain(GetProductsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Mhub Products of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.Product;
     * import com.pulumi.alicloud.mhub.ProductArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new Product(&#34;default&#34;, ProductArgs.builder()        
     *             .productName(name)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getProducts();
     * 
     *         ctx.export(&#34;mhubProductId1&#34;, ids.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *         final var nameRegex = MhubFunctions.getProducts(GetProductsArgs.builder()
     *             .nameRegex(&#34;^my-Product&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubProductId2&#34;, nameRegex.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetProductsResult> getProducts(GetProductsArgs args) {
        return getProducts(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Mhub Products of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.Product;
     * import com.pulumi.alicloud.mhub.ProductArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new Product(&#34;default&#34;, ProductArgs.builder()        
     *             .productName(name)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getProducts();
     * 
     *         ctx.export(&#34;mhubProductId1&#34;, ids.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *         final var nameRegex = MhubFunctions.getProducts(GetProductsArgs.builder()
     *             .nameRegex(&#34;^my-Product&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubProductId2&#34;, nameRegex.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductsResult> getProductsPlain(GetProductsPlainArgs args) {
        return getProductsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Mhub Products of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.Product;
     * import com.pulumi.alicloud.mhub.ProductArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new Product(&#34;default&#34;, ProductArgs.builder()        
     *             .productName(name)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getProducts();
     * 
     *         ctx.export(&#34;mhubProductId1&#34;, ids.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *         final var nameRegex = MhubFunctions.getProducts(GetProductsArgs.builder()
     *             .nameRegex(&#34;^my-Product&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubProductId2&#34;, nameRegex.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetProductsResult> getProducts(GetProductsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:mhub/getProducts:getProducts", TypeShape.of(GetProductsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Mhub Products of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.138.0+.
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
     * import com.pulumi.alicloud.mhub.Product;
     * import com.pulumi.alicloud.mhub.ProductArgs;
     * import com.pulumi.alicloud.mhub.MhubFunctions;
     * import com.pulumi.alicloud.mhub.inputs.GetProductsArgs;
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
     *         final var config = ctx.config();
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;example_value&#34;);
     *         var default_ = new Product(&#34;default&#34;, ProductArgs.builder()        
     *             .productName(name)
     *             .build());
     * 
     *         final var ids = MhubFunctions.getProducts();
     * 
     *         ctx.export(&#34;mhubProductId1&#34;, ids.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *         final var nameRegex = MhubFunctions.getProducts(GetProductsArgs.builder()
     *             .nameRegex(&#34;^my-Product&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;mhubProductId2&#34;, nameRegex.applyValue(getProductsResult -&gt; getProductsResult.products()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetProductsResult> getProductsPlain(GetProductsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:mhub/getProducts:getProducts", TypeShape.of(GetProductsResult.class), args, Utilities.withVersion(options));
    }
}
