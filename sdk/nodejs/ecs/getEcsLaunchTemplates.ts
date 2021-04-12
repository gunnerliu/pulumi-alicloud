// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Ecs Launch Templates of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.120.0+.
 *
 * ## Example Usage
 *
 * Basic Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const example = alicloud.ecs.getEcsLaunchTemplates({
 *     ids: ["lt-bp1a469uxxxxxx"],
 *     nameRegex: "your_launch_name",
 * });
 * export const firstEcsLaunchTemplateId = example.then(example => example.templates[0].id);
 * ```
 */
export function getEcsLaunchTemplates(args?: GetEcsLaunchTemplatesArgs, opts?: pulumi.InvokeOptions): Promise<GetEcsLaunchTemplatesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    if (!opts.version) {
        opts.version = utilities.getVersion();
    }
    return pulumi.runtime.invoke("alicloud:ecs/getEcsLaunchTemplates:getEcsLaunchTemplates", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "launchTemplateName": args.launchTemplateName,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "templateResourceGroupId": args.templateResourceGroupId,
        "templateTags": args.templateTags,
    }, opts);
}

/**
 * A collection of arguments for invoking getEcsLaunchTemplates.
 */
export interface GetEcsLaunchTemplatesArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    readonly enableDetails?: boolean;
    /**
     * A list of Launch Template IDs.
     */
    readonly ids?: string[];
    /**
     * The Launch Template Name.
     */
    readonly launchTemplateName?: string;
    /**
     * A regex string to filter results by Launch Template name.
     */
    readonly nameRegex?: string;
    readonly outputFile?: string;
    /**
     * The template resource group id.
     */
    readonly templateResourceGroupId?: string;
    /**
     * The template tags.
     */
    readonly templateTags?: {[key: string]: any};
}

/**
 * A collection of values returned by getEcsLaunchTemplates.
 */
export interface GetEcsLaunchTemplatesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly launchTemplateName?: string;
    readonly nameRegex?: string;
    readonly names: string[];
    readonly outputFile?: string;
    readonly templateResourceGroupId?: string;
    readonly templateTags?: {[key: string]: any};
    readonly templates: outputs.ecs.GetEcsLaunchTemplatesTemplate[];
}
