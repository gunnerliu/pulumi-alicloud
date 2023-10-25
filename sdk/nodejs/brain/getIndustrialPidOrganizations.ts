// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Brain Industrial Pid Organizations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.113.0+.
 */
export function getIndustrialPidOrganizations(args?: GetIndustrialPidOrganizationsArgs, opts?: pulumi.InvokeOptions): Promise<GetIndustrialPidOrganizationsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:brain/getIndustrialPidOrganizations:getIndustrialPidOrganizations", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "parentOrganizationId": args.parentOrganizationId,
    }, opts);
}

/**
 * A collection of arguments for invoking getIndustrialPidOrganizations.
 */
export interface GetIndustrialPidOrganizationsArgs {
    /**
     * A list of Pid Organization IDs.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Pid Organization name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * The parent organization id.
     */
    parentOrganizationId?: string;
}

/**
 * A collection of values returned by getIndustrialPidOrganizations.
 */
export interface GetIndustrialPidOrganizationsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    readonly names: string[];
    readonly organizations: outputs.brain.GetIndustrialPidOrganizationsOrganization[];
    readonly outputFile?: string;
    readonly parentOrganizationId?: string;
}
/**
 * This data source provides the Brain Industrial Pid Organizations of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.113.0+.
 */
export function getIndustrialPidOrganizationsOutput(args?: GetIndustrialPidOrganizationsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetIndustrialPidOrganizationsResult> {
    return pulumi.output(args).apply((a: any) => getIndustrialPidOrganizations(a, opts))
}

/**
 * A collection of arguments for invoking getIndustrialPidOrganizations.
 */
export interface GetIndustrialPidOrganizationsOutputArgs {
    /**
     * A list of Pid Organization IDs.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Pid Organization name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * The parent organization id.
     */
    parentOrganizationId?: pulumi.Input<string>;
}
