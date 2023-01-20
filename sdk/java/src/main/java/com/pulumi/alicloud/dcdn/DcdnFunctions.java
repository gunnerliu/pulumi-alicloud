// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.dcdn;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.dcdn.inputs.GetDomainsArgs;
import com.pulumi.alicloud.dcdn.inputs.GetDomainsPlainArgs;
import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsPlainArgs;
import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
import com.pulumi.alicloud.dcdn.inputs.GetServicePlainArgs;
import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsPlainArgs;
import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesPlainArgs;
import com.pulumi.alicloud.dcdn.outputs.GetDomainsResult;
import com.pulumi.alicloud.dcdn.outputs.GetIpaDomainsResult;
import com.pulumi.alicloud.dcdn.outputs.GetServiceResult;
import com.pulumi.alicloud.dcdn.outputs.GetWafDomainsResult;
import com.pulumi.alicloud.dcdn.outputs.GetWafPoliciesResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DcdnFunctions {
    /**
     * Provides a collection of DCDN Domains to the specified filters.
     * 
     * &gt; **NOTE:** Available in 1.94.0+.
     * 
     */
    public static Output<GetDomainsResult> getDomains() {
        return getDomains(GetDomainsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides a collection of DCDN Domains to the specified filters.
     * 
     * &gt; **NOTE:** Available in 1.94.0+.
     * 
     */
    public static CompletableFuture<GetDomainsResult> getDomainsPlain() {
        return getDomainsPlain(GetDomainsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Provides a collection of DCDN Domains to the specified filters.
     * 
     * &gt; **NOTE:** Available in 1.94.0+.
     * 
     */
    public static Output<GetDomainsResult> getDomains(GetDomainsArgs args) {
        return getDomains(args, InvokeOptions.Empty);
    }
    /**
     * Provides a collection of DCDN Domains to the specified filters.
     * 
     * &gt; **NOTE:** Available in 1.94.0+.
     * 
     */
    public static CompletableFuture<GetDomainsResult> getDomainsPlain(GetDomainsPlainArgs args) {
        return getDomainsPlain(args, InvokeOptions.Empty);
    }
    /**
     * Provides a collection of DCDN Domains to the specified filters.
     * 
     * &gt; **NOTE:** Available in 1.94.0+.
     * 
     */
    public static Output<GetDomainsResult> getDomains(GetDomainsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dcdn/getDomains:getDomains", TypeShape.of(GetDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Provides a collection of DCDN Domains to the specified filters.
     * 
     * &gt; **NOTE:** Available in 1.94.0+.
     * 
     */
    public static CompletableFuture<GetDomainsResult> getDomainsPlain(GetDomainsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dcdn/getDomains:getDomains", TypeShape.of(GetDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Dcdn Ipa Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.158.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
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
     *         final var ids = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .domainName(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId1&#34;, ids.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *         final var status = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .status(&#34;online&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId2&#34;, status.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIpaDomainsResult> getIpaDomains() {
        return getIpaDomains(GetIpaDomainsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Ipa Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.158.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
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
     *         final var ids = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .domainName(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId1&#34;, ids.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *         final var status = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .status(&#34;online&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId2&#34;, status.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIpaDomainsResult> getIpaDomainsPlain() {
        return getIpaDomainsPlain(GetIpaDomainsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Ipa Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.158.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
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
     *         final var ids = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .domainName(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId1&#34;, ids.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *         final var status = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .status(&#34;online&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId2&#34;, status.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIpaDomainsResult> getIpaDomains(GetIpaDomainsArgs args) {
        return getIpaDomains(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Ipa Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.158.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
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
     *         final var ids = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .domainName(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId1&#34;, ids.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *         final var status = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .status(&#34;online&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId2&#34;, status.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIpaDomainsResult> getIpaDomainsPlain(GetIpaDomainsPlainArgs args) {
        return getIpaDomainsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Ipa Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.158.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
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
     *         final var ids = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .domainName(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId1&#34;, ids.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *         final var status = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .status(&#34;online&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId2&#34;, status.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetIpaDomainsResult> getIpaDomains(GetIpaDomainsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dcdn/getIpaDomains:getIpaDomains", TypeShape.of(GetIpaDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Dcdn Ipa Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.158.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetIpaDomainsArgs;
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
     *         final var ids = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .domainName(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId1&#34;, ids.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *         final var status = DcdnFunctions.getIpaDomains(GetIpaDomainsArgs.builder()
     *             .status(&#34;online&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;dcdnIpaDomainId2&#34;, status.applyValue(getIpaDomainsResult -&gt; getIpaDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetIpaDomainsResult> getIpaDomainsPlain(GetIpaDomainsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dcdn/getIpaDomains:getIpaDomains", TypeShape.of(GetIpaDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open DCDN service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DCDN and how to use it, see [What is DCDN](https://help.aliyun.com/document_detail/197288.html).
     * 
     * &gt; **NOTE:** Available in v1.111.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
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
     *         final var open = DcdnFunctions.getService(GetServiceArgs.builder()
     *             .enable(&#34;On&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService() {
        return getService(GetServiceArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DCDN service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DCDN and how to use it, see [What is DCDN](https://help.aliyun.com/document_detail/197288.html).
     * 
     * &gt; **NOTE:** Available in v1.111.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
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
     *         final var open = DcdnFunctions.getService(GetServiceArgs.builder()
     *             .enable(&#34;On&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain() {
        return getServicePlain(GetServicePlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DCDN service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DCDN and how to use it, see [What is DCDN](https://help.aliyun.com/document_detail/197288.html).
     * 
     * &gt; **NOTE:** Available in v1.111.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
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
     *         final var open = DcdnFunctions.getService(GetServiceArgs.builder()
     *             .enable(&#34;On&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args) {
        return getService(args, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DCDN service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DCDN and how to use it, see [What is DCDN](https://help.aliyun.com/document_detail/197288.html).
     * 
     * &gt; **NOTE:** Available in v1.111.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
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
     *         final var open = DcdnFunctions.getService(GetServiceArgs.builder()
     *             .enable(&#34;On&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args) {
        return getServicePlain(args, InvokeOptions.Empty);
    }
    /**
     * Using this data source can open DCDN service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DCDN and how to use it, see [What is DCDN](https://help.aliyun.com/document_detail/197288.html).
     * 
     * &gt; **NOTE:** Available in v1.111.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
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
     *         final var open = DcdnFunctions.getService(GetServiceArgs.builder()
     *             .enable(&#34;On&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetServiceResult> getService(GetServiceArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dcdn/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * Using this data source can open DCDN service automatically. If the service has been opened, it will return opened.
     * 
     * For information about DCDN and how to use it, see [What is DCDN](https://help.aliyun.com/document_detail/197288.html).
     * 
     * &gt; **NOTE:** Available in v1.111.0+
     * 
     * ## Example Usage
     * ```java
     * package generated_program;
     * 
     * import com.pulumi.Context;
     * import com.pulumi.Pulumi;
     * import com.pulumi.core.Output;
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetServiceArgs;
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
     *         final var open = DcdnFunctions.getService(GetServiceArgs.builder()
     *             .enable(&#34;On&#34;)
     *             .build());
     * 
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetServiceResult> getServicePlain(GetServicePlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dcdn/getService:getService", TypeShape.of(GetServiceResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.185.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
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
     *         final var ids = DcdnFunctions.getWafDomains();
     * 
     *         ctx.export(&#34;dcdnWafDomainId1&#34;, ids.applyValue(getWafDomainsResult -&gt; getWafDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWafDomainsResult> getWafDomains() {
        return getWafDomains(GetWafDomainsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.185.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
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
     *         final var ids = DcdnFunctions.getWafDomains();
     * 
     *         ctx.export(&#34;dcdnWafDomainId1&#34;, ids.applyValue(getWafDomainsResult -&gt; getWafDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWafDomainsResult> getWafDomainsPlain() {
        return getWafDomainsPlain(GetWafDomainsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.185.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
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
     *         final var ids = DcdnFunctions.getWafDomains();
     * 
     *         ctx.export(&#34;dcdnWafDomainId1&#34;, ids.applyValue(getWafDomainsResult -&gt; getWafDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWafDomainsResult> getWafDomains(GetWafDomainsArgs args) {
        return getWafDomains(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.185.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
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
     *         final var ids = DcdnFunctions.getWafDomains();
     * 
     *         ctx.export(&#34;dcdnWafDomainId1&#34;, ids.applyValue(getWafDomainsResult -&gt; getWafDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWafDomainsResult> getWafDomainsPlain(GetWafDomainsPlainArgs args) {
        return getWafDomainsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.185.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
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
     *         final var ids = DcdnFunctions.getWafDomains();
     * 
     *         ctx.export(&#34;dcdnWafDomainId1&#34;, ids.applyValue(getWafDomainsResult -&gt; getWafDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWafDomainsResult> getWafDomains(GetWafDomainsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dcdn/getWafDomains:getWafDomains", TypeShape.of(GetWafDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Dcdn Waf Domains of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.185.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafDomainsArgs;
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
     *         final var ids = DcdnFunctions.getWafDomains();
     * 
     *         ctx.export(&#34;dcdnWafDomainId1&#34;, ids.applyValue(getWafDomainsResult -&gt; getWafDomainsResult.domains()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWafDomainsResult> getWafDomainsPlain(GetWafDomainsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dcdn/getWafDomains:getWafDomains", TypeShape.of(GetWafDomainsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.184.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
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
     *         final var ids = DcdnFunctions.getWafPolicies();
     * 
     *         ctx.export(&#34;dcdnWafPolicyId1&#34;, ids.applyValue(getWafPoliciesResult -&gt; getWafPoliciesResult.policies()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWafPoliciesResult> getWafPolicies() {
        return getWafPolicies(GetWafPoliciesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.184.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
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
     *         final var ids = DcdnFunctions.getWafPolicies();
     * 
     *         ctx.export(&#34;dcdnWafPolicyId1&#34;, ids.applyValue(getWafPoliciesResult -&gt; getWafPoliciesResult.policies()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWafPoliciesResult> getWafPoliciesPlain() {
        return getWafPoliciesPlain(GetWafPoliciesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.184.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
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
     *         final var ids = DcdnFunctions.getWafPolicies();
     * 
     *         ctx.export(&#34;dcdnWafPolicyId1&#34;, ids.applyValue(getWafPoliciesResult -&gt; getWafPoliciesResult.policies()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWafPoliciesResult> getWafPolicies(GetWafPoliciesArgs args) {
        return getWafPolicies(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.184.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
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
     *         final var ids = DcdnFunctions.getWafPolicies();
     * 
     *         ctx.export(&#34;dcdnWafPolicyId1&#34;, ids.applyValue(getWafPoliciesResult -&gt; getWafPoliciesResult.policies()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWafPoliciesResult> getWafPoliciesPlain(GetWafPoliciesPlainArgs args) {
        return getWafPoliciesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.184.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
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
     *         final var ids = DcdnFunctions.getWafPolicies();
     * 
     *         ctx.export(&#34;dcdnWafPolicyId1&#34;, ids.applyValue(getWafPoliciesResult -&gt; getWafPoliciesResult.policies()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetWafPoliciesResult> getWafPolicies(GetWafPoliciesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:dcdn/getWafPolicies:getWafPolicies", TypeShape.of(GetWafPoliciesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Dcdn Waf Policies of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.184.0+.
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
     * import com.pulumi.alicloud.dcdn.DcdnFunctions;
     * import com.pulumi.alicloud.dcdn.inputs.GetWafPoliciesArgs;
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
     *         final var ids = DcdnFunctions.getWafPolicies();
     * 
     *         ctx.export(&#34;dcdnWafPolicyId1&#34;, ids.applyValue(getWafPoliciesResult -&gt; getWafPoliciesResult.policies()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetWafPoliciesResult> getWafPoliciesPlain(GetWafPoliciesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:dcdn/getWafPolicies:getWafPolicies", TypeShape.of(GetWafPoliciesResult.class), args, Utilities.withVersion(options));
    }
}
