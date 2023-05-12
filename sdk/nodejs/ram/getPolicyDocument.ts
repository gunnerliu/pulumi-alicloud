// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * This data source Generates a RAM policy document of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.184.0+.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const basicExample = alicloud.ram.getPolicyDocument({
 *     version: "1",
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["oss:*"],
 *         resources: [
 *             "acs:oss:*:*:myphotos",
 *             "acs:oss:*:*:myphotos/*",
 *         ],
 *     }],
 * });
 * const _default = new alicloud.ram.Policy("default", {
 *     policyName: "tf-test",
 *     policyDocument: basicExample.then(basicExample => basicExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.basic_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Multiple Condition Keys and Values
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const multipleCondition = alicloud.ram.getPolicyDocument({
 *     version: "1",
 *     statements: [
 *         {
 *             effect: "Allow",
 *             actions: [
 *                 "oss:ListBuckets",
 *                 "oss:GetBucketStat",
 *                 "oss:GetBucketInfo",
 *                 "oss:GetBucketTagging",
 *                 "oss:GetBucketAcl",
 *             ],
 *             resources: ["acs:oss:*:*:*"],
 *         },
 *         {
 *             effect: "Allow",
 *             actions: [
 *                 "oss:GetObject",
 *                 "oss:GetObjectAcl",
 *             ],
 *             resources: ["acs:oss:*:*:myphotos/hangzhou/2015/*"],
 *         },
 *         {
 *             effect: "Allow",
 *             actions: ["oss:ListObjects"],
 *             resources: ["acs:oss:*:*:myphotos"],
 *             conditions: [
 *                 {
 *                     operator: "StringLike",
 *                     variable: "oss:Delimiter",
 *                     values: ["/"],
 *                 },
 *                 {
 *                     operator: "StringLike",
 *                     variable: "oss:Prefix",
 *                     values: [
 *                         "",
 *                         "hangzhou/",
 *                         "hangzhou/2015/*",
 *                     ],
 *                 },
 *             ],
 *         },
 *     ],
 * });
 * const policy = new alicloud.ram.Policy("policy", {
 *     policyName: "tf-test-condition",
 *     policyDocument: multipleCondition.then(multipleCondition => multipleCondition.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.multiple_condition.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with RAM Principal
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ramExample = alicloud.ram.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             entity: "RAM",
 *             identifiers: ["acs:ram::123456789012****:root"],
 *         }],
 *     }],
 * });
 * const role = new alicloud.ram.Role("role", {
 *     document: ramExample.then(ramExample => ramExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.ram_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with Service Principal
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const serviceExample = alicloud.ram.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             entity: "Service",
 *             identifiers: ["ecs.aliyuncs.com"],
 *         }],
 *     }],
 * });
 * const role = new alicloud.ram.Role("role", {
 *     document: serviceExample.then(serviceExample => serviceExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.service_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with Federated Principal
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const federatedExample = alicloud.ram.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             entity: "Federated",
 *             identifiers: ["acs:ram::123456789012****:saml-provider/testprovider"],
 *         }],
 *         conditions: [{
 *             operator: "StringEquals",
 *             variable: "saml:recipient",
 *             values: ["https://signin.aliyun.com/saml-role/sso"],
 *         }],
 *     }],
 * });
 * const role = new alicloud.ram.Role("role", {
 *     document: federatedExample.then(federatedExample => federatedExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.federated_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 */
export function getPolicyDocument(args?: GetPolicyDocumentArgs, opts?: pulumi.InvokeOptions): Promise<GetPolicyDocumentResult> {
    args = args || {};

    opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts || {});
    return pulumi.runtime.invoke("alicloud:ram/getPolicyDocument:getPolicyDocument", {
        "outputFile": args.outputFile,
        "statements": args.statements,
        "version": args.version,
    }, opts);
}

/**
 * A collection of arguments for invoking getPolicyDocument.
 */
export interface GetPolicyDocumentArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: string;
    /**
     * Statement of the RAM policy document. See the following `Block statement`.
     */
    statements?: inputs.ram.GetPolicyDocumentStatement[];
    /**
     * Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     */
    version?: string;
}

/**
 * A collection of values returned by getPolicyDocument.
 */
export interface GetPolicyDocumentResult {
    /**
     * Standard policy document rendered based on the arguments above.
     */
    readonly document: string;
    /**
     * The provider-assigned unique ID for this managed resource.
     */
    readonly id: string;
    readonly outputFile?: string;
    readonly statements?: outputs.ram.GetPolicyDocumentStatement[];
    readonly version?: string;
}
/**
 * This data source Generates a RAM policy document of the current Alibaba Cloud user.
 *
 * > **NOTE:** Available in v1.184.0+.
 *
 * ## Example Usage
 * ### Basic Example
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const basicExample = alicloud.ram.getPolicyDocument({
 *     version: "1",
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["oss:*"],
 *         resources: [
 *             "acs:oss:*:*:myphotos",
 *             "acs:oss:*:*:myphotos/*",
 *         ],
 *     }],
 * });
 * const _default = new alicloud.ram.Policy("default", {
 *     policyName: "tf-test",
 *     policyDocument: basicExample.then(basicExample => basicExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.basic_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Multiple Condition Keys and Values
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const multipleCondition = alicloud.ram.getPolicyDocument({
 *     version: "1",
 *     statements: [
 *         {
 *             effect: "Allow",
 *             actions: [
 *                 "oss:ListBuckets",
 *                 "oss:GetBucketStat",
 *                 "oss:GetBucketInfo",
 *                 "oss:GetBucketTagging",
 *                 "oss:GetBucketAcl",
 *             ],
 *             resources: ["acs:oss:*:*:*"],
 *         },
 *         {
 *             effect: "Allow",
 *             actions: [
 *                 "oss:GetObject",
 *                 "oss:GetObjectAcl",
 *             ],
 *             resources: ["acs:oss:*:*:myphotos/hangzhou/2015/*"],
 *         },
 *         {
 *             effect: "Allow",
 *             actions: ["oss:ListObjects"],
 *             resources: ["acs:oss:*:*:myphotos"],
 *             conditions: [
 *                 {
 *                     operator: "StringLike",
 *                     variable: "oss:Delimiter",
 *                     values: ["/"],
 *                 },
 *                 {
 *                     operator: "StringLike",
 *                     variable: "oss:Prefix",
 *                     values: [
 *                         "",
 *                         "hangzhou/",
 *                         "hangzhou/2015/*",
 *                     ],
 *                 },
 *             ],
 *         },
 *     ],
 * });
 * const policy = new alicloud.ram.Policy("policy", {
 *     policyName: "tf-test-condition",
 *     policyDocument: multipleCondition.then(multipleCondition => multipleCondition.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.multiple_condition.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with RAM Principal
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const ramExample = alicloud.ram.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             entity: "RAM",
 *             identifiers: ["acs:ram::123456789012****:root"],
 *         }],
 *     }],
 * });
 * const role = new alicloud.ram.Role("role", {
 *     document: ramExample.then(ramExample => ramExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.ram_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with Service Principal
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const serviceExample = alicloud.ram.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             entity: "Service",
 *             identifiers: ["ecs.aliyuncs.com"],
 *         }],
 *     }],
 * });
 * const role = new alicloud.ram.Role("role", {
 *     document: serviceExample.then(serviceExample => serviceExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.service_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 * ### Example Assume-Role Policy with Federated Principal
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * const federatedExample = alicloud.ram.getPolicyDocument({
 *     statements: [{
 *         effect: "Allow",
 *         actions: ["sts:AssumeRole"],
 *         principals: [{
 *             entity: "Federated",
 *             identifiers: ["acs:ram::123456789012****:saml-provider/testprovider"],
 *         }],
 *         conditions: [{
 *             operator: "StringEquals",
 *             variable: "saml:recipient",
 *             values: ["https://signin.aliyun.com/saml-role/sso"],
 *         }],
 *     }],
 * });
 * const role = new alicloud.ram.Role("role", {
 *     document: federatedExample.then(federatedExample => federatedExample.document),
 *     force: true,
 * });
 * ```
 *
 * `data.alicloud_ram_policy_document.federated_example.document` will evaluate to:
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * ```
 */
export function getPolicyDocumentOutput(args?: GetPolicyDocumentOutputArgs, opts?: pulumi.InvokeOptions): pulumi.Output<GetPolicyDocumentResult> {
    return pulumi.output(args).apply((a: any) => getPolicyDocument(a, opts))
}

/**
 * A collection of arguments for invoking getPolicyDocument.
 */
export interface GetPolicyDocumentOutputArgs {
    /**
     * File name where to save data source results (after running `pulumi preview`).
     */
    outputFile?: pulumi.Input<string>;
    /**
     * Statement of the RAM policy document. See the following `Block statement`.
     */
    statements?: pulumi.Input<pulumi.Input<inputs.ram.GetPolicyDocumentStatementArgs>[]>;
    /**
     * Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     */
    version?: pulumi.Input<string>;
}
