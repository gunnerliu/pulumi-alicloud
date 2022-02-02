// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the Sae Ingresses of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.137.0+.
 */
export function getIngresses(args: GetIngressesArgs, opts?: pulumi.InvokeOptions): Promise<GetIngressesResult> {
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:sae/getIngresses:getIngresses", {
        "enableDetails": args.enableDetails,
        "ids": args.ids,
        "namespaceId": args.namespaceId,
        "outputFile": args.outputFile,
    }, opts);
}

/**
 * A collection of arguments for invoking getIngresses.
 */
export interface GetIngressesArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: boolean;
    /**
     * A list of Ingress IDs.
     */
    ids?: string[];
    /**
     * The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
     */
    namespaceId: string;
    outputFile?: string;
}

/**
 * A collection of values returned by getIngresses.
 */
export interface GetIngressesResult {
    readonly enableDetails?: boolean;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly ingresses: outputs.sae.GetIngressesIngress[];
    readonly namespaceId: string;
    readonly outputFile?: string;
}

export function getIngressesOutput(args: GetIngressesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIngressesResult> {
    return pulumi.output(args).apply(a => getIngresses(a, opts))
}

/**
 * A collection of arguments for invoking getIngresses.
 */
export interface GetIngressesOutputArgs {
    /**
     * Default to `false`. Set it to `true` can output more details about resource attributes.
     */
    enableDetails?: pulumi.Input<boolean>;
    /**
     * A list of Ingress IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The Id of Namespace.It can contain 2 to 32 characters.The value is in format {RegionId}:{namespace}.
     */
    namespaceId: pulumi.Input<string>;
    outputFile?: pulumi.Input<string>;
}
