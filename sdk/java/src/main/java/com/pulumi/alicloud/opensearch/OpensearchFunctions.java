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
     */
    public static CompletableFuture<GetAppGroupsResult> getAppGroupsPlain(GetAppGroupsPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:opensearch/getAppGroups:getAppGroups", TypeShape.of(GetAppGroupsResult.class), args, Utilities.withVersion(options));
    }
}
