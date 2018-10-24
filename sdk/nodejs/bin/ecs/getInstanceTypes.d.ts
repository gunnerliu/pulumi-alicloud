import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides the ECS instance types of Alibaba Cloud.
 *
 * ~> **NOTE:** By default, only the upgraded instance types are returned. If you want to get outdated instance types, you must set `is_outdated` to true.
 *
 * ~> **NOTE:** If one instance type is sold out, it will not be exported.
 */
export declare function getInstanceTypes(args?: GetInstanceTypesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceTypesResult>;
/**
 * A collection of arguments for invoking getInstanceTypes.
 */
export interface GetInstanceTypesArgs {
    /**
     * The zone where instance types are supported.
     */
    readonly availabilityZone?: string;
    /**
     * Filter the results to a specific number of cpu cores.
     */
    readonly cpuCoreCount?: number;
    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    readonly instanceChargeType?: string;
    /**
     * Filter the results based on their family name. For example: 'ecs.n4'.
     */
    readonly instanceTypeFamily?: string;
    /**
     * If true, outdated instance types are included in the results. Default to false.
     */
    readonly isOutdated?: boolean;
    /**
     * Filter the results to a specific memory size in GB.
     */
    readonly memorySize?: number;
    /**
     * Filter the results by network type. Valid values: `Classic` and `Vpc`.
     */
    readonly networkType?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
    /**
     * - (Optional) Filter the results by ECS spot type. Valid values: `NoSpot`, `SpotWithPriceLimit` and `SpotAsPriceGo`. Default to `NoSpot`.
     */
    readonly spotStrategy?: string;
}
/**
 * A collection of values returned by getInstanceTypes.
 */
export interface GetInstanceTypesResult {
    /**
     * A list of image types. Each element contains the following attributes:
     */
    readonly instanceTypes: {
        availabilityZones: string[];
        burstableInstance: {
            baselineCredit: string;
            initialCredit: string;
        };
        cpuCoreCount: number;
        eniAmount: number;
        family: string;
        gpu: {
            amount: string;
            category: string;
        };
        id: string;
        localStorage: {
            amount: string;
            capacity: string;
            category: string;
        };
        memorySize: number;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}