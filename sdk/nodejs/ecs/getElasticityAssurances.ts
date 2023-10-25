// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides Ecs Elasticity Assurance available to the user.
 *
 * > **NOTE:** Available in 1.196.0+
 */
export function getElasticityAssurances(args?: GetElasticityAssurancesArgs, opts?: pulumi.InvokeOptions): Promise<GetElasticityAssurancesResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ecs/getElasticityAssurances:getElasticityAssurances", {
        "ids": args.ids,
        "outputFile": args.outputFile,
        "privatePoolOptionsIds": args.privatePoolOptionsIds,
        "resourceGroupId": args.resourceGroupId,
        "status": args.status,
        "tags": args.tags,
    }, opts);
}

/**
 * A collection of arguments for invoking getElasticityAssurances.
 */
export interface GetElasticityAssurancesArgs {
    /**
     * A list of Elasticity Assurance IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The ID of the elastic protection service.
     */
    privatePoolOptionsIds?: string[];
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: string;
    /**
     * The status of flexible guarantee services. Possible values: `All`, `Preparing`, `Prepared`, `Active`, `Released`.
     */
    status?: string;
    /**
     * The tag key-value pair information bound by the elastic guarantee service.
     */
    tags?: {[key: string]: any};
}

/**
 * A collection of values returned by getElasticityAssurances.
 */
export interface GetElasticityAssurancesResult {
    /**
     * A list of Elasticity Assurance Entries. Each element contains the following attributes:
     */
    readonly assurances: outputs.ecs.GetElasticityAssurancesAssurance[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of Elasticity Assurance IDs.
     */
    readonly ids: string[];
    readonly outputFile?: string;
    readonly privatePoolOptionsIds?: string[];
    /**
     * The ID of the resource group.
     */
    readonly resourceGroupId?: string;
    /**
     * The status of flexible guarantee services. Possible values:-Preparing: in preparation.-Prepared: to take effect.-Active: in effect.-Released: Released.
     */
    readonly status?: string;
    /**
     * A mapping of tags to assign to the Capacity Reservation.
     */
    readonly tags?: {[key: string]: any};
}
/**
 * This data source provides Ecs Elasticity Assurance available to the user.
 *
 * > **NOTE:** Available in 1.196.0+
 */
export function getElasticityAssurancesOutput(args?: GetElasticityAssurancesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetElasticityAssurancesResult> {
    return pulumi.output(args).apply((a: any) => getElasticityAssurances(a, opts))
}

/**
 * A collection of arguments for invoking getElasticityAssurances.
 */
export interface GetElasticityAssurancesOutputArgs {
    /**
     * A list of Elasticity Assurance IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The ID of the elastic protection service.
     */
    privatePoolOptionsIds?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * The ID of the resource group.
     */
    resourceGroupId?: pulumi.Input<string>;
    /**
     * The status of flexible guarantee services. Possible values: `All`, `Preparing`, `Prepared`, `Active`, `Released`.
     */
    status?: pulumi.Input<string>;
    /**
     * The tag key-value pair information bound by the elastic guarantee service.
     */
    tags?: pulumi.Input<{[key: string]: any}>;
}
