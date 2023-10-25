// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Nas Filesets of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.153.0+.
 */
export function getFilesets(args: GetFilesetsArgs, opts?: pulumi.InvokeOptions): Promise<GetFilesetsResult> {

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:nas/getFilesets:getFilesets", {
        "fileSystemId": args.fileSystemId,
        "ids": args.ids,
        "outputFile": args.outputFile,
        "status": args.status,
    }, opts);
}

/**
 * A collection of arguments for invoking getFilesets.
 */
export interface GetFilesetsArgs {
    /**
     * The ID of the file system.
     */
    fileSystemId: string;
    /**
     * A list of Fileset IDs.
     */
    ids?: string[];
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The status of the fileset.
     */
    status?: string;
}

/**
 * A collection of values returned by getFilesets.
 */
export interface GetFilesetsResult {
    readonly fileSystemId: string;
    readonly filesets: outputs.nas.GetFilesetsFileset[];
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly outputFile?: string;
    readonly status?: string;
}
/**
 * This data source provides the Nas Filesets of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.153.0+.
 */
export function getFilesetsOutput(args: GetFilesetsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetFilesetsResult> {
    return pulumi.output(args).apply((a: any) => getFilesets(a, opts))
}

/**
 * A collection of arguments for invoking getFilesets.
 */
export interface GetFilesetsOutputArgs {
    /**
     * The ID of the file system.
     */
    fileSystemId: pulumi.Input<string>;
    /**
     * A list of Fileset IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The status of the fileset.
     */
    status?: pulumi.Input<string>;
}
