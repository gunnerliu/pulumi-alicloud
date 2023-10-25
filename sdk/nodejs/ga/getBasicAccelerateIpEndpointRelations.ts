// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Global Accelerator (GA) Basic Accelerate Ip Endpoint Relations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.194.0+.
 */
export function getBasicAccelerateIpEndpointRelations(args: GetBasicAccelerateIpEndpointRelationsArgs, opts?: pulumi.InvokeOptions): Promise<GetBasicAccelerateIpEndpointRelationsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ga/getBasicAccelerateIpEndpointRelations:getBasicAccelerateIpEndpointRelations", {
        "accelerateIpId": args.accelerateIpId,
        "acceleratorId": args.acceleratorId,
        "endpointId": args.endpointId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getBasicAccelerateIpEndpointRelations.
 */
export interface GetBasicAccelerateIpEndpointRelationsArgs {
    /**
     * The ID of the Basic Accelerate IP.
     */
    accelerateIpId?: string;
    /**
     * The ID of the Global Accelerator Basic Accelerator instance.
     */
    acceleratorId: string;
    /**
     * The ID of the Basic Endpoint.
     */
    endpointId?: string;
    /**
     * A list of Global Accelerator Basic Accelerate Ip Endpoint Relations IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the Global Accelerator Basic Accelerate Ip Endpoint Relation. Valid Value: `active`.
     */
    status?: string;
}

/**
 * A collection of values returned by getBasicAccelerateIpEndpointRelations.
 */
export interface GetBasicAccelerateIpEndpointRelationsResult {
    /**
     * The ID of the Basic Accelerate IP.
     */
    readonly accelerateIpId?: string;
    /**
     * The ID of the Global Accelerator Basic Accelerator instance.
     */
    readonly acceleratorId: string;
    /**
     * The ID of the Basic Endpoint.
     */
    readonly endpointId?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    /**
     * A list of Global Accelerator Basic Accelerate Ip Endpoint Relations. Each element contains the following attributes:
     */
    readonly relations: outputs.ga.GetBasicAccelerateIpEndpointRelationsRelation[];
    /**
     * The status of the Basic Accelerate Ip Endpoint Relation.
     */
    readonly status?: string;
}
/**
 * This data source provides the Global Accelerator (GA) Basic Accelerate Ip Endpoint Relations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.194.0+.
 */
export function getBasicAccelerateIpEndpointRelationsOutput(args: GetBasicAccelerateIpEndpointRelationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetBasicAccelerateIpEndpointRelationsResult> {
    return pulumi.output(args).apply((a: any) => getBasicAccelerateIpEndpointRelations(a, opts))
}

/**
 * A collection of arguments for invoking getBasicAccelerateIpEndpointRelations.
 */
export interface GetBasicAccelerateIpEndpointRelationsOutputArgs {
    /**
     * The ID of the Basic Accelerate IP.
     */
    accelerateIpId?: pulumi.Input<string>;
    /**
     * The ID of the Global Accelerator Basic Accelerator instance.
     */
    acceleratorId: pulumi.Input<string>;
    /**
     * The ID of the Basic Endpoint.
     */
    endpointId?: pulumi.Input<string>;
    /**
     * A list of Global Accelerator Basic Accelerate Ip Endpoint Relations IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the Global Accelerator Basic Accelerate Ip Endpoint Relation. Valid Value: `active`.
     */
    status?: pulumi.Input<string>;
}
