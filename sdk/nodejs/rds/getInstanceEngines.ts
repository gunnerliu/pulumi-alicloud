// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * This data source provides the RDS instance engines resource available info of Alibaba Cloud.
 *
 * > **NOTE:** Available in v1.46.0+
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const resources = pulumi.output(alicloud.rds.getInstanceEngines({
 *     engine: "MySQL",
 *     engineVersion: "5.6",
 *     instanceChargeType: "PostPaid",
 *     outputFile: "./engines.txt",
 * }));
 *
 * export const firstDbCategory = resources.instanceEngines[0].category;
 * ```
 */
export function getInstanceEngines(args?: GetInstanceEnginesArgs, opts?: pulumi.InvokeOptions): Promise<GetInstanceEnginesResult> {
    args = args || {};
    if (!opts) {
        opts = {}
    }

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
    return pulumi.runtime.invoke("alicloud:rds/getInstanceEngines:getInstanceEngines", {
        "category": args.category,
        "dbInstanceStorageType": args.dbInstanceStorageType,
        "engine": args.engine,
        "engineVersion": args.engineVersion,
        "instanceChargeType": args.instanceChargeType,
        "multiZone": args.multiZone,
        "outputFile": args.outputFile,
        "zoneId": args.zoneId,
    }, opts);
}

/**
 * A collection of arguments for invoking getInstanceEngines.
 */
export interface GetInstanceEnginesArgs {
    /**
     * DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     */
    category?: string;
    /**
     * The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
     */
    dbInstanceStorageType?: string;
    /**
     * Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "PPAS", "MariaDB". If not set, it will match all of engines.
     */
    engine?: string;
    /**
     * Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     */
    engineVersion?: string;
    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    instanceChargeType?: string;
    /**
     * Whether to show multi available zone. Default false to not show multi availability zone.
     */
    multiZone?: boolean;
    outputFile?: string;
    /**
     * The Zone to launch the DB instance.
     */
    zoneId?: string;
}

/**
 * A collection of values returned by getInstanceEngines.
 */
export interface GetInstanceEnginesResult {
    /**
     * DB Instance category.
     */
    readonly category?: string;
    readonly dbInstanceStorageType?: string;
    /**
     * Database type.
     */
    readonly engine?: string;
    /**
     * DB Instance version.
     */
    readonly engineVersion?: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    /**
     * A list of engines.
     */
    readonly ids: string[];
    readonly instanceChargeType?: string;
    /**
     * A list of Rds available resource. Each element contains the following attributes:
     */
    readonly instanceEngines: outputs.rds.GetInstanceEnginesInstanceEngine[];
    readonly multiZone?: boolean;
    readonly outputFile?: string;
    readonly zoneId?: string;
}

export function getInstanceEnginesOutput(args?: GetInstanceEnginesOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetInstanceEnginesResult> {
    return pulumi.output(args).apply(a => getInstanceEngines(a, opts))
}

/**
 * A collection of arguments for invoking getInstanceEngines.
 */
export interface GetInstanceEnginesOutputArgs {
    /**
     * DB Instance category. the value like [`Basic`, `HighAvailability`, `Finance`, `AlwaysOn`], [detail info](https://www.alibabacloud.com/help/doc-detail/69795.htm).
     */
    category?: pulumi.Input<string>;
    /**
     * The DB instance storage space required by the user. Valid values: "cloudSsd", "localSsd", "cloudEssd", "cloudEssd2", "cloudEssd3".
     */
    dbInstanceStorageType?: pulumi.Input<string>;
    /**
     * Database type. Valid values: "MySQL", "SQLServer", "PostgreSQL", "PPAS", "MariaDB". If not set, it will match all of engines.
     */
    engine?: pulumi.Input<string>;
    /**
     * Database version required by the user. Value options can refer to the latest docs [detail info](https://www.alibabacloud.com/help/doc-detail/26228.htm) `EngineVersion`.
     */
    engineVersion?: pulumi.Input<string>;
    /**
     * Filter the results by charge type. Valid values: `PrePaid` and `PostPaid`. Default to `PostPaid`.
     */
    instanceChargeType?: pulumi.Input<string>;
    /**
     * Whether to show multi available zone. Default false to not show multi availability zone.
     */
    multiZone?: pulumi.Input<boolean>;
    outputFile?: pulumi.Input<string>;
    /**
     * The Zone to launch the DB instance.
     */
    zoneId?: pulumi.Input<string>;
}
