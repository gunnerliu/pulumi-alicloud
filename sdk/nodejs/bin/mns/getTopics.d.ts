import * as pulumi from "@pulumi/pulumi";
/**
 * This data source provides a list of MNS topics in an Alibaba Cloud account according to the specified parameters.
 */
export declare function getTopics(args?: GetTopicsArgs, opts?: pulumi.InvokeOptions): Promise<GetTopicsResult>;
/**
 * A collection of arguments for invoking getTopics.
 */
export interface GetTopicsArgs {
    /**
     * A string to filter resulting topics by their name prefixs.
     */
    readonly namePrefix?: string;
    /**
     * File name where to save data source results (after running `terraform plan`).
     */
    readonly outputFile?: string;
}
/**
 * A collection of values returned by getTopics.
 */
export interface GetTopicsResult {
    /**
     * A list of users. Each element contains the following attributes:
     */
    readonly topics: {
        id: string;
        loggingEnabled: boolean;
        maximumMessageSize: number;
        name: string;
    }[];
    /**
     * id is the provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
}