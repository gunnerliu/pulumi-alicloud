// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.alicloud.quickbi;

import com.pulumi.alicloud.Utilities;
import com.pulumi.alicloud.quickbi.inputs.GetUsersArgs;
import com.pulumi.alicloud.quickbi.inputs.GetUsersPlainArgs;
import com.pulumi.alicloud.quickbi.outputs.GetUsersResult;
import com.pulumi.core.Output;
import com.pulumi.core.TypeShape;
import com.pulumi.deployment.Deployment;
import com.pulumi.deployment.InvokeOptions;
import java.util.concurrent.CompletableFuture;

public final class QuickbiFunctions {
    /**
     * This data source provides the Quick BI Users of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUsersResult> getUsers() {
        return getUsers(GetUsersArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Quick BI Users of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain() {
        return getUsersPlain(GetUsersPlainArgs.Empty, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Quick BI Users of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUsersResult> getUsers(GetUsersArgs args) {
        return getUsers(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Quick BI Users of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args) {
        return getUsersPlain(args, InvokeOptions.Empty);
    }
    /**
     * This data source provides the Quick BI Users of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
     * 
     * ## Example Usage
     * 
     */
    public static Output<GetUsersResult> getUsers(GetUsersArgs args, InvokeOptions options) {
        return Deployment.getInstance().invoke("alicloud:quickbi/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
    /**
     * This data source provides the Quick BI Users of the current Alibaba Cloud user.
     * 
     * &gt; **NOTE:** Available in v1.136.0+.
     * 
     * ## Example Usage
     * 
     */
    public static CompletableFuture<GetUsersResult> getUsersPlain(GetUsersPlainArgs args, InvokeOptions options) {
        return Deployment.getInstance().invokeAsync("alicloud:quickbi/getUsers:getUsers", TypeShape.of(GetUsersResult.class), args, Utilities.withVersion(options));
    }
}
