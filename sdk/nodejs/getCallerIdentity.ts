// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "./utilities";

/**
 * This data source provides the identity of the current user.
 * 
 * > **NOTE:** Available in 1.65.0+.
 * 
 * ## Example Usage
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const current = alicloud.getCallerIdentity();
 * 
 * export const currentUserArn = current.id;
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/caller_identity.html.markdown.
 */
export function getCallerIdentity(opts?: pulumi.InvokeOptions): Promise<GetCallerIdentityResult> & GetCallerIdentityResult {
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    const promise: Promise<GetCallerIdentityResult> = pulumi.runtime.invoke("alicloud:index/getCallerIdentity:getCallerIdentity", {
    }, opts);

    return pulumi.utils.liftProperties(promise, opts);
}

/**
 * A collection of values returned by getCallerIdentity.
 */
export interface GetCallerIdentityResult {
    /**
     * Account ID.
     */
    readonly accountId: string;
    /**
     * The Alibaba Cloud Resource Name (ARN) of the user making the call.
     */
    readonly arn: string;
    /**
     * The type of the princiapal. RAMUser for users.
     */
    readonly identityType: string;
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}