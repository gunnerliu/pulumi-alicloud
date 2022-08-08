// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.opensearch;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsPlainArgs;
import com.pulumi.alicloud.opensearch.outputs.GetAppGroupsResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class OpensearchFunctions {
    /**
     * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
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
     * import com.pulumi.alicloud.opensearch.AppGroup;
     * import com.pulumi.alicloud.opensearch.AppGroupArgs;
     * import com.pulumi.alicloud.opensearch.inputs.AppGroupQuotaArgs;
     * import com.pulumi.alicloud.opensearch.OpensearchFunctions;
     * import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
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
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_testacc&#34;);
     *         var defaultAppGroup = new AppGroup(&#34;defaultAppGroup&#34;, AppGroupArgs.builder()        
     *             .appGroupName(name)
     *             .paymentType(&#34;PayAsYouGo&#34;)
     *             .type(&#34;standard&#34;)
     *             .quota(AppGroupQuotaArgs.builder()
     *                 .docSize(1)
     *                 .computeResource(20)
     *                 .spec(&#34;opensearch.share.common&#34;)
     *                 .build())
     *             .build());
     * 
     *         final var defaultAppGroups = OpensearchFunctions.getAppGroups(GetAppGroupsArgs.builder()
     *             .ids(defaultAppGroup.id())
     *             .build());
     * 
     *         ctx.export(&#34;appGroups&#34;, defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult).applyValue(defaultAppGroups -&gt; defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult.groups())));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAppGroupsResult> getAppGroups() {
        return getAppGroups(GetAppGroupsArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
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
     * import com.pulumi.alicloud.opensearch.AppGroup;
     * import com.pulumi.alicloud.opensearch.AppGroupArgs;
     * import com.pulumi.alicloud.opensearch.inputs.AppGroupQuotaArgs;
     * import com.pulumi.alicloud.opensearch.OpensearchFunctions;
     * import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
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
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_testacc&#34;);
     *         var defaultAppGroup = new AppGroup(&#34;defaultAppGroup&#34;, AppGroupArgs.builder()        
     *             .appGroupName(name)
     *             .paymentType(&#34;PayAsYouGo&#34;)
     *             .type(&#34;standard&#34;)
     *             .quota(AppGroupQuotaArgs.builder()
     *                 .docSize(1)
     *                 .computeResource(20)
     *                 .spec(&#34;opensearch.share.common&#34;)
     *                 .build())
     *             .build());
     * 
     *         final var defaultAppGroups = OpensearchFunctions.getAppGroups(GetAppGroupsArgs.builder()
     *             .ids(defaultAppGroup.id())
     *             .build());
     * 
     *         ctx.export(&#34;appGroups&#34;, defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult).applyValue(defaultAppGroups -&gt; defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult.groups())));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppGroupsResult> getAppGroupsPlain() {
        return getAppGroupsPlain(GetAppGroupsPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
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
     * import com.pulumi.alicloud.opensearch.AppGroup;
     * import com.pulumi.alicloud.opensearch.AppGroupArgs;
     * import com.pulumi.alicloud.opensearch.inputs.AppGroupQuotaArgs;
     * import com.pulumi.alicloud.opensearch.OpensearchFunctions;
     * import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
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
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_testacc&#34;);
     *         var defaultAppGroup = new AppGroup(&#34;defaultAppGroup&#34;, AppGroupArgs.builder()        
     *             .appGroupName(name)
     *             .paymentType(&#34;PayAsYouGo&#34;)
     *             .type(&#34;standard&#34;)
     *             .quota(AppGroupQuotaArgs.builder()
     *                 .docSize(1)
     *                 .computeResource(20)
     *                 .spec(&#34;opensearch.share.common&#34;)
     *                 .build())
     *             .build());
     * 
     *         final var defaultAppGroups = OpensearchFunctions.getAppGroups(GetAppGroupsArgs.builder()
     *             .ids(defaultAppGroup.id())
     *             .build());
     * 
     *         ctx.export(&#34;appGroups&#34;, defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult).applyValue(defaultAppGroups -&gt; defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult.groups())));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAppGroupsResult> getAppGroups(GetAppGroupsArgs args) {
        return getAppGroups(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
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
     * import com.pulumi.alicloud.opensearch.AppGroup;
     * import com.pulumi.alicloud.opensearch.AppGroupArgs;
     * import com.pulumi.alicloud.opensearch.inputs.AppGroupQuotaArgs;
     * import com.pulumi.alicloud.opensearch.OpensearchFunctions;
     * import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
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
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_testacc&#34;);
     *         var defaultAppGroup = new AppGroup(&#34;defaultAppGroup&#34;, AppGroupArgs.builder()        
     *             .appGroupName(name)
     *             .paymentType(&#34;PayAsYouGo&#34;)
     *             .type(&#34;standard&#34;)
     *             .quota(AppGroupQuotaArgs.builder()
     *                 .docSize(1)
     *                 .computeResource(20)
     *                 .spec(&#34;opensearch.share.common&#34;)
     *                 .build())
     *             .build());
     * 
     *         final var defaultAppGroups = OpensearchFunctions.getAppGroups(GetAppGroupsArgs.builder()
     *             .ids(defaultAppGroup.id())
     *             .build());
     * 
     *         ctx.export(&#34;appGroups&#34;, defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult).applyValue(defaultAppGroups -&gt; defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult.groups())));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppGroupsResult> getAppGroupsPlain(GetAppGroupsPlainArgs args) {
        return getAppGroupsPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
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
     * import com.pulumi.alicloud.opensearch.AppGroup;
     * import com.pulumi.alicloud.opensearch.AppGroupArgs;
     * import com.pulumi.alicloud.opensearch.inputs.AppGroupQuotaArgs;
     * import com.pulumi.alicloud.opensearch.OpensearchFunctions;
     * import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
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
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_testacc&#34;);
     *         var defaultAppGroup = new AppGroup(&#34;defaultAppGroup&#34;, AppGroupArgs.builder()        
     *             .appGroupName(name)
     *             .paymentType(&#34;PayAsYouGo&#34;)
     *             .type(&#34;standard&#34;)
     *             .quota(AppGroupQuotaArgs.builder()
     *                 .docSize(1)
     *                 .computeResource(20)
     *                 .spec(&#34;opensearch.share.common&#34;)
     *                 .build())
     *             .build());
     * 
     *         final var defaultAppGroups = OpensearchFunctions.getAppGroups(GetAppGroupsArgs.builder()
     *             .ids(defaultAppGroup.id())
     *             .build());
     * 
     *         ctx.export(&#34;appGroups&#34;, defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult).applyValue(defaultAppGroups -&gt; defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult.groups())));
     *     }
     * }
     * ```
     * 
     */
    public static Output<GetAppGroupsResult> getAppGroups(GetAppGroupsArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:opensearch/getAppGroups:getAppGroups", TypeShape.of(GetAppGroupsResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Open Search App Groups of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
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
     * import com.pulumi.alicloud.opensearch.AppGroup;
     * import com.pulumi.alicloud.opensearch.AppGroupArgs;
     * import com.pulumi.alicloud.opensearch.inputs.AppGroupQuotaArgs;
     * import com.pulumi.alicloud.opensearch.OpensearchFunctions;
     * import com.pulumi.alicloud.opensearch.inputs.GetAppGroupsArgs;
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
     *         final var name = config.get(&#34;name&#34;).orElse(&#34;tf_testacc&#34;);
     *         var defaultAppGroup = new AppGroup(&#34;defaultAppGroup&#34;, AppGroupArgs.builder()        
     *             .appGroupName(name)
     *             .paymentType(&#34;PayAsYouGo&#34;)
     *             .type(&#34;standard&#34;)
     *             .quota(AppGroupQuotaArgs.builder()
     *                 .docSize(1)
     *                 .computeResource(20)
     *                 .spec(&#34;opensearch.share.common&#34;)
     *                 .build())
     *             .build());
     * 
     *         final var defaultAppGroups = OpensearchFunctions.getAppGroups(GetAppGroupsArgs.builder()
     *             .ids(defaultAppGroup.id())
     *             .build());
     * 
     *         ctx.export(&#34;appGroups&#34;, defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult).applyValue(defaultAppGroups -&gt; defaultAppGroups.applyValue(getAppGroupsResult -&gt; getAppGroupsResult.groups())));
     *     }
     * }
     * ```
     * 
     */
    public static CompletableFuture<GetAppGroupsResult> getAppGroupsPlain(GetAppGroupsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:opensearch/getAppGroups:getAppGroups", TypeShape.of(GetAppGroupsResult.class), args, Utilities.withVersion(options));
    }
}
