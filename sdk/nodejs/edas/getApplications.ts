// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides a list of EDAS application in an Alibaba Cloud account according to the specified filters.
 * 
 * > **NOTE:** Available in 1.82.0+
 * 
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/d/edas_applications.html.markdown.
 */
export function getApplications(args?: GetApplicationsArgs, opts?: pulumi.InvokeOptions): Promise<GetApplicationsResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:edas/getApplications:getApplications", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getApplications.
 */
export interface GetApplicationsArgs {
    /**
     * An ids string to filter results by the application id. 
     */
    readonly ids?: string[];
    /**
     * A regex string to filter results by the application name. 
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
}

/**
 * A collection of values returned by getApplications.
 */
export interface GetApplicationsResult {
    /**
     * A list of applications.
     */
    readonly applications: outputs.edas.GetApplicationsApplication[];
    /**
     * A list of application IDs.
     */
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of applications names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}
