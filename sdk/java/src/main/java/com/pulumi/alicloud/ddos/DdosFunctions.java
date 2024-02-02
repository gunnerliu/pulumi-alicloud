// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.ddos;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.ddos.inputs.GetDdosBgpInstancesArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosBgpInstancesPlainArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosBgpIpsArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosBgpIpsPlainArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesPlainArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesPlainArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosCooPortsArgs;
import com.pulumi.alicloud.ddos.inputs.GetDdosCooPortsPlainArgs;
import com.pulumi.alicloud.ddos.outputs.GetDdosBgpInstancesResult;
import com.pulumi.alicloud.ddos.outputs.GetDdosBgpIpsResult;
import com.pulumi.alicloud.ddos.outputs.GetDdosCooDomainResourcesResult;
import com.pulumi.alicloud.ddos.outputs.GetDdosCooInstancesResult;
import com.pulumi.alicloud.ddos.outputs.GetDdosCooPortsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class DdosFunctions {
    /**
     * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
     * 
     * &gt; **NOTE:** Available in v1.183.0+ .
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDdosBgpInstancesResult> getDdosBgpInstances() {
        return getDdosBgpInstances(GetDdosBgpInstancesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
     * 
     * &gt; **NOTE:** Available in v1.183.0+ .
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDdosBgpInstancesResult> getDdosBgpInstancesPlain() {
        return getDdosBgpInstancesPlain(GetDdosBgpInstancesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
     * 
     * &gt; **NOTE:** Available in v1.183.0+ .
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDdosBgpInstancesResult> getDdosBgpInstances(GetDdosBgpInstancesArgs args) {
        return getDdosBgpInstances(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
     * 
     * &gt; **NOTE:** Available in v1.183.0+ .
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDdosBgpInstancesResult> getDdosBgpInstancesPlain(GetDdosBgpInstancesPlainArgs args) {
        return getDdosBgpInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
     * 
     * &gt; **NOTE:** Available in v1.183.0+ .
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetDdosBgpInstancesResult> getDdosBgpInstances(GetDdosBgpInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", TypeShape.of(GetDdosBgpInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides a list of Anti-DDoS Advanced instances in an Alibaba Cloud account according to the specified filters.
     * 
     * &gt; **NOTE:** Available in v1.183.0+ .
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetDdosBgpInstancesResult> getDdosBgpInstancesPlain(GetDdosBgpInstancesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ddos/getDdosBgpInstances:getDdosBgpInstances", TypeShape.of(GetDdosBgpInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ddos Bgp Ips of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.180.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosBgpIpsArgs;
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
     *         final var ids = DdosFunctions.getDdosBgpIps(GetDdosBgpIpsArgs.builder()
     *             .instanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;ddosbgpIpId1&#34;, ids.applyValue(getDdosBgpIpsResult -&gt; getDdosBgpIpsResult.ips()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosBgpIpsResult> getDdosBgpIps(GetDdosBgpIpsArgs args) {
        return getDdosBgpIps(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddos Bgp Ips of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.180.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosBgpIpsArgs;
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
     *         final var ids = DdosFunctions.getDdosBgpIps(GetDdosBgpIpsArgs.builder()
     *             .instanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;ddosbgpIpId1&#34;, ids.applyValue(getDdosBgpIpsResult -&gt; getDdosBgpIpsResult.ips()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosBgpIpsResult> getDdosBgpIpsPlain(GetDdosBgpIpsPlainArgs args) {
        return getDdosBgpIpsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddos Bgp Ips of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.180.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosBgpIpsArgs;
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
     *         final var ids = DdosFunctions.getDdosBgpIps(GetDdosBgpIpsArgs.builder()
     *             .instanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;ddosbgpIpId1&#34;, ids.applyValue(getDdosBgpIpsResult -&gt; getDdosBgpIpsResult.ips()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosBgpIpsResult> getDdosBgpIps(GetDdosBgpIpsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ddos/getDdosBgpIps:getDdosBgpIps", TypeShape.of(GetDdosBgpIpsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ddos Bgp Ips of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.180.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosBgpIpsArgs;
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
     *         final var ids = DdosFunctions.getDdosBgpIps(GetDdosBgpIpsArgs.builder()
     *             .instanceId(&#34;example_value&#34;)
     *             .ids(            
     *                 &#34;example_value-1&#34;,
     *                 &#34;example_value-2&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;ddosbgpIpId1&#34;, ids.applyValue(getDdosBgpIpsResult -&gt; getDdosBgpIpsResult.ips()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosBgpIpsResult> getDdosBgpIpsPlain(GetDdosBgpIpsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ddos/getDdosBgpIps:getDdosBgpIps", TypeShape.of(GetDdosBgpIpsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
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
     *         final var example = DdosFunctions.getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.builder()
     *             .ids(&#34;tftestacc1234.abc&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooDomainResourceId&#34;, example.applyValue(getDdosCooDomainResourcesResult -&gt; getDdosCooDomainResourcesResult.resources()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooDomainResourcesResult> getDdosCooDomainResources() {
        return getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
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
     *         final var example = DdosFunctions.getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.builder()
     *             .ids(&#34;tftestacc1234.abc&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooDomainResourceId&#34;, example.applyValue(getDdosCooDomainResourcesResult -&gt; getDdosCooDomainResourcesResult.resources()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooDomainResourcesResult> getDdosCooDomainResourcesPlain() {
        return getDdosCooDomainResourcesPlain(GetDdosCooDomainResourcesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
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
     *         final var example = DdosFunctions.getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.builder()
     *             .ids(&#34;tftestacc1234.abc&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooDomainResourceId&#34;, example.applyValue(getDdosCooDomainResourcesResult -&gt; getDdosCooDomainResourcesResult.resources()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooDomainResourcesResult> getDdosCooDomainResources(GetDdosCooDomainResourcesArgs args) {
        return getDdosCooDomainResources(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
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
     *         final var example = DdosFunctions.getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.builder()
     *             .ids(&#34;tftestacc1234.abc&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooDomainResourceId&#34;, example.applyValue(getDdosCooDomainResourcesResult -&gt; getDdosCooDomainResourcesResult.resources()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooDomainResourcesResult> getDdosCooDomainResourcesPlain(GetDdosCooDomainResourcesPlainArgs args) {
        return getDdosCooDomainResourcesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
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
     *         final var example = DdosFunctions.getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.builder()
     *             .ids(&#34;tftestacc1234.abc&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooDomainResourceId&#34;, example.applyValue(getDdosCooDomainResourcesResult -&gt; getDdosCooDomainResourcesResult.resources()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooDomainResourcesResult> getDdosCooDomainResources(GetDdosCooDomainResourcesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ddos/getDdosCooDomainResources:getDdosCooDomainResources", TypeShape.of(GetDdosCooDomainResourcesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ddoscoo Domain Resources of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooDomainResourcesArgs;
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
     *         final var example = DdosFunctions.getDdosCooDomainResources(GetDdosCooDomainResourcesArgs.builder()
     *             .ids(&#34;tftestacc1234.abc&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooDomainResourceId&#34;, example.applyValue(getDdosCooDomainResourcesResult -&gt; getDdosCooDomainResourcesResult.resources()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooDomainResourcesResult> getDdosCooDomainResourcesPlain(GetDdosCooDomainResourcesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ddos/getDdosCooDomainResources:getDdosCooDomainResources", TypeShape.of(GetDdosCooDomainResourcesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the BGP-Line Anti-DDoS Pro(DdosCoo) instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available since v1.39.0.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
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
     *         final var default = DdosFunctions.getDdosCooInstances(GetDdosCooInstancesArgs.builder()
     *             .nameRegex(&#34;tf&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instance&#34;, default_.instances().stream().map(element -&gt; element.id()).collect(toList()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooInstancesResult> getDdosCooInstances() {
        return getDdosCooInstances(GetDdosCooInstancesArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the BGP-Line Anti-DDoS Pro(DdosCoo) instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available since v1.39.0.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
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
     *         final var default = DdosFunctions.getDdosCooInstances(GetDdosCooInstancesArgs.builder()
     *             .nameRegex(&#34;tf&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instance&#34;, default_.instances().stream().map(element -&gt; element.id()).collect(toList()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooInstancesResult> getDdosCooInstancesPlain() {
        return getDdosCooInstancesPlain(GetDdosCooInstancesPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the BGP-Line Anti-DDoS Pro(DdosCoo) instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available since v1.39.0.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
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
     *         final var default = DdosFunctions.getDdosCooInstances(GetDdosCooInstancesArgs.builder()
     *             .nameRegex(&#34;tf&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instance&#34;, default_.instances().stream().map(element -&gt; element.id()).collect(toList()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooInstancesResult> getDdosCooInstances(GetDdosCooInstancesArgs args) {
        return getDdosCooInstances(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the BGP-Line Anti-DDoS Pro(DdosCoo) instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available since v1.39.0.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
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
     *         final var default = DdosFunctions.getDdosCooInstances(GetDdosCooInstancesArgs.builder()
     *             .nameRegex(&#34;tf&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instance&#34;, default_.instances().stream().map(element -&gt; element.id()).collect(toList()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooInstancesResult> getDdosCooInstancesPlain(GetDdosCooInstancesPlainArgs args) {
        return getDdosCooInstancesPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the BGP-Line Anti-DDoS Pro(DdosCoo) instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available since v1.39.0.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
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
     *         final var default = DdosFunctions.getDdosCooInstances(GetDdosCooInstancesArgs.builder()
     *             .nameRegex(&#34;tf&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instance&#34;, default_.instances().stream().map(element -&gt; element.id()).collect(toList()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooInstancesResult> getDdosCooInstances(GetDdosCooInstancesArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ddos/getDdosCooInstances:getDdosCooInstances", TypeShape.of(GetDdosCooInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the BGP-Line Anti-DDoS Pro(DdosCoo) instances of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available since v1.39.0.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooInstancesArgs;
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
     *         final var default = DdosFunctions.getDdosCooInstances(GetDdosCooInstancesArgs.builder()
     *             .nameRegex(&#34;tf&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;instance&#34;, default_.instances().stream().map(element -&gt; element.id()).collect(toList()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooInstancesResult> getDdosCooInstancesPlain(GetDdosCooInstancesPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ddos/getDdosCooInstances:getDdosCooInstances", TypeShape.of(GetDdosCooInstancesResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ddoscoo Ports of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooPortsArgs;
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
     *         final var example = DdosFunctions.getDdosCooPorts(GetDdosCooPortsArgs.builder()
     *             .instanceId(&#34;ddoscoo-cn-6ja1rl4j****&#34;)
     *             .ids(&#34;ddoscoo-cn-6ja1rl4j****:7001:tcp&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooPortId&#34;, example.applyValue(getDdosCooPortsResult -&gt; getDdosCooPortsResult.ports()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooPortsResult> getDdosCooPorts(GetDdosCooPortsArgs args) {
        return getDdosCooPorts(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddoscoo Ports of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooPortsArgs;
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
     *         final var example = DdosFunctions.getDdosCooPorts(GetDdosCooPortsArgs.builder()
     *             .instanceId(&#34;ddoscoo-cn-6ja1rl4j****&#34;)
     *             .ids(&#34;ddoscoo-cn-6ja1rl4j****:7001:tcp&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooPortId&#34;, example.applyValue(getDdosCooPortsResult -&gt; getDdosCooPortsResult.ports()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooPortsResult> getDdosCooPortsPlain(GetDdosCooPortsPlainArgs args) {
        return getDdosCooPortsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Ddoscoo Ports of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooPortsArgs;
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
     *         final var example = DdosFunctions.getDdosCooPorts(GetDdosCooPortsArgs.builder()
     *             .instanceId(&#34;ddoscoo-cn-6ja1rl4j****&#34;)
     *             .ids(&#34;ddoscoo-cn-6ja1rl4j****:7001:tcp&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooPortId&#34;, example.applyValue(getDdosCooPortsResult -&gt; getDdosCooPortsResult.ports()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetDdosCooPortsResult> getDdosCooPorts(GetDdosCooPortsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:ddos/getDdosCooPorts:getDdosCooPorts", TypeShape.of(GetDdosCooPortsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Ddoscoo Ports of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.123.0+.
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
     * import com.pulumi.alicloud.ddos.DdosFunctions;
     * import com.pulumi.alicloud.ddos.inputs.GetDdosCooPortsArgs;
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
     *         final var example = DdosFunctions.getDdosCooPorts(GetDdosCooPortsArgs.builder()
     *             .instanceId(&#34;ddoscoo-cn-6ja1rl4j****&#34;)
     *             .ids(&#34;ddoscoo-cn-6ja1rl4j****:7001:tcp&#34;)
     *             .build());
     * 
     *         ctx.export(&#34;firstDdoscooPortId&#34;, example.applyValue(getDdosCooPortsResult -&gt; getDdosCooPortsResult.ports()[0].id()));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetDdosCooPortsResult> getDdosCooPortsPlain(GetDdosCooPortsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:ddos/getDdosCooPorts:getDdosCooPorts", TypeShape.of(GetDdosCooPortsResult.class), args, Utilities.withVersion(options));
    }
}
