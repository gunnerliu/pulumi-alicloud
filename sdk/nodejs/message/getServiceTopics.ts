// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source provides the Message Notification Service Topics of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.188.0+.
 */
export function getServiceTopics(args?: GetServiceTopicsArgs, opts?: pulumi.InvokeOptions): Promise<GetServiceTopicsResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:message/getServiceTopics:getServiceTopics", {
        "ids": args.ids,
        "nameRegex": args.nameRegex,
        "outputFile": args.outputFile,
        "pageNumber": args.pageNumber,
        "pageSize": args.pageSize,
        "topicName": args.topicName,
    }, opts);
}

/**
 * A collection of arguments for invoking getServiceTopics.
 */
export interface GetServiceTopicsArgs {
    /**
     * A list of Topic IDs. Its element value is same as Topic Name.
     */
    ids?: string[];
    /**
     * A regex string to filter results by Topic name.
     */
    nameRegex?: string;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    pageNumber?: number;
    pageSize?: number;
    /**
     * The name of the topic.
     */
    topicName?: string;
}

/**
 * A collection of values returned by getServiceTopics.
 */
export interface GetServiceTopicsResult {
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly ids: string[];
    readonly nameRegex?: string;
    /**
     * A list of Topic names.
     */
    readonly names: string[];
    readonly outputFile?: string;
    readonly pageNumber?: number;
    readonly pageSize?: number;
    /**
     * The name of the topic.
     */
    readonly topicName?: string;
    /**
     * A list of Topics. Each element contains the following attributes:
     */
    readonly topics: outputs.message.GetServiceTopicsTopic[];
}
/**
 * This data source provides the Message Notification Service Topics of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.188.0+.
 */
export function getServiceTopicsOutput(args?: GetServiceTopicsOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetServiceTopicsResult> {
    return pulumi.output(args).apply((a: any) => getServiceTopics(a, opts))
}

/**
 * A collection of arguments for invoking getServiceTopics.
 */
export interface GetServiceTopicsOutputArgs {
    /**
     * A list of Topic IDs. Its element value is same as Topic Name.
     */
    ids?: pulumi.Input<pulumi.Input<string>[]>;
    /**
     * A regex string to filter results by Topic name.
     */
    nameRegex?: pulumi.Input<string>;
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    pageNumber?: pulumi.Input<number>;
    pageSize?: pulumi.Input<number>;
    /**
     * The name of the topic.
     */
    topicName?: pulumi.Input<string>;
}
