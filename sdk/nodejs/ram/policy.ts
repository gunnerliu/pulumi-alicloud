// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as inputs from "../types/input";
import * as outputs from "../types/output";
import * as utilities from "../utilities";

/**
 * Provides a RAM Policy resource.
 *
 * > **NOTE:** When you want to destroy this resource forcefully(means remove all the relationships associated with it automatically and then destroy it) without set `force`  with `true` at beginning, you need add `force = true` to configuration file and run `pulumi preview`, then you can delete resource forcefully.
 *
 * > **NOTE:** Each policy can own at most 5 versions and the oldest version will be removed after its version achieves 5.
 *
 * > **NOTE:** If the policy has multiple versions, all non-default versions will be deleted first when deleting policy.
 *
 * ## Example Usage
 *
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 *
 * // Create a new RAM Policy.
 * const policy = new alicloud.ram.Policy("policy", {
 *     description: "this is a policy test",
 *     force: true,
 *     policyDocument: `  {
 *     "Statement": [
 *       {
 *         "Action": [
 *           "oss:ListObjects",
 *           "oss:GetObject"
 *         ],
 *         "Effect": "Allow",
 *         "Resource": [
 *           "acs:oss:*:*:mybucket",
 *           "acs:oss:*:*:mybucket/*"
 *         ]
 *       }
 *     ],
 *       "Version": "1"
 *   }
 *   
 * `,
 *     policyName: "policyName",
 * });
 * ```
 *
 * ## Import
 *
 * RAM policy can be imported using the id or name, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:ram/policy:Policy example my-policy
 * ```
 */
export class Policy extends pulumi.CustomResource {
    /**
     * Get an existing Policy resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: PolicyState, opts?: pulumi.CustomResourceOptions): Policy {
        return new Policy(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:ram/policy:Policy';

    /**
     * Returns true if the given object is an instance of Policy.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Policy {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Policy.__pulumiType;
    }

    /**
     * The policy attachment count.
     */
    public /*out*/ readonly attachmentCount!: pulumi.Output<number>;
    /**
     * The default version of policy.
     */
    public /*out*/ readonly defaultVersion!: pulumi.Output<string>;
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
     *
     * @deprecated Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
     */
    public readonly document!: pulumi.Output<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    public readonly force!: pulumi.Output<boolean | undefined>;
    /**
     * It has been deprecated from provider version 1.114.0 and `policyName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
     */
    public readonly name!: pulumi.Output<string>;
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     */
    public readonly policyDocument!: pulumi.Output<string>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    public readonly policyName!: pulumi.Output<string>;
    /**
     * The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
     */
    public readonly rotateStrategy!: pulumi.Output<string | undefined>;
    /**
     * (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
     *
     * @deprecated Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace. 
     */
    public readonly statements!: pulumi.Output<outputs.ram.PolicyStatement[]>;
    /**
     * The policy type.
     */
    public /*out*/ readonly type!: pulumi.Output<string>;
    /**
     * (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     *
     * @deprecated Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace. 
     */
    public readonly version!: pulumi.Output<string | undefined>;
    /**
     * The ID of default version policy.
     */
    public /*out*/ readonly versionId!: pulumi.Output<string>;

    /**
     * Create a Policy resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: PolicyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: PolicyArgs | PolicyState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as PolicyState | undefined;
            resourceInputs["attachmentCount"] = state ? state.attachmentCount : undefined;
            resourceInputs["defaultVersion"] = state ? state.defaultVersion : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["document"] = state ? state.document : undefined;
            resourceInputs["force"] = state ? state.force : undefined;
            resourceInputs["name"] = state ? state.name : undefined;
            resourceInputs["policyDocument"] = state ? state.policyDocument : undefined;
            resourceInputs["policyName"] = state ? state.policyName : undefined;
            resourceInputs["rotateStrategy"] = state ? state.rotateStrategy : undefined;
            resourceInputs["statements"] = state ? state.statements : undefined;
            resourceInputs["type"] = state ? state.type : undefined;
            resourceInputs["version"] = state ? state.version : undefined;
            resourceInputs["versionId"] = state ? state.versionId : undefined;
        } else {
            const args = argsOrState as PolicyArgs | undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["document"] = args ? args.document : undefined;
            resourceInputs["force"] = args ? args.force : undefined;
            resourceInputs["name"] = args ? args.name : undefined;
            resourceInputs["policyDocument"] = args ? args.policyDocument : undefined;
            resourceInputs["policyName"] = args ? args.policyName : undefined;
            resourceInputs["rotateStrategy"] = args ? args.rotateStrategy : undefined;
            resourceInputs["statements"] = args ? args.statements : undefined;
            resourceInputs["version"] = args ? args.version : undefined;
            resourceInputs["attachmentCount"] = undefined /*out*/;
            resourceInputs["defaultVersion"] = undefined /*out*/;
            resourceInputs["type"] = undefined /*out*/;
            resourceInputs["versionId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(Policy.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Policy resources.
 */
export interface PolicyState {
    /**
     * The policy attachment count.
     */
    attachmentCount?: pulumi.Input<number>;
    /**
     * The default version of policy.
     */
    defaultVersion?: pulumi.Input<string>;
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
     *
     * @deprecated Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
     */
    document?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    force?: pulumi.Input<boolean>;
    /**
     * It has been deprecated from provider version 1.114.0 and `policyName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     */
    policyDocument?: pulumi.Input<string>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    policyName?: pulumi.Input<string>;
    /**
     * The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
     */
    rotateStrategy?: pulumi.Input<string>;
    /**
     * (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
     *
     * @deprecated Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace. 
     */
    statements?: pulumi.Input<pulumi.Input<inputs.ram.PolicyStatement>[]>;
    /**
     * The policy type.
     */
    type?: pulumi.Input<string>;
    /**
     * (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     *
     * @deprecated Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace. 
     */
    version?: pulumi.Input<string>;
    /**
     * The ID of default version policy.
     */
    versionId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Policy resource.
 */
export interface PolicyArgs {
    /**
     * Description of the RAM policy. This name can have a string of 1 to 1024 characters.
     */
    description?: pulumi.Input<string>;
    /**
     * It has been deprecated from provider version 1.114.0 and `policyDocument` instead.
     *
     * @deprecated Field 'document' has been deprecated from provider version 1.114.0. New field 'policy_document' instead.
     */
    document?: pulumi.Input<string>;
    /**
     * This parameter is used for resource destroy. Default value is `false`.
     */
    force?: pulumi.Input<boolean>;
    /**
     * It has been deprecated from provider version 1.114.0 and `policyName` instead.
     *
     * @deprecated Field 'name' has been deprecated from provider version 1.114.0. New field 'policy_name' instead.
     */
    name?: pulumi.Input<string>;
    /**
     * Document of the RAM policy. It is required when the `statement` is not specified.
     */
    policyDocument?: pulumi.Input<string>;
    /**
     * Name of the RAM policy. This name can have a string of 1 to 128 characters, must contain only alphanumeric characters or hyphen "-", and must not begin with a hyphen.
     */
    policyName?: pulumi.Input<string>;
    /**
     * The rotation strategy of the policy. You can use this parameter to delete an early policy version. Valid Values: `None`, `DeleteOldestNonDefaultVersionWhenLimitExceeded`. Default to `None`.
     */
    rotateStrategy?: pulumi.Input<string>;
    /**
     * (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Statements of the RAM policy document. It is required when the `document` is not specified.
     *
     * @deprecated Field 'statement' has been deprecated from version 1.49.0, and use field 'document' to replace. 
     */
    statements?: pulumi.Input<pulumi.Input<inputs.ram.PolicyStatement>[]>;
    /**
     * (It has been deprecated from version 1.49.0, and use field 'document' to replace.) Version of the RAM policy document. Valid value is `1`. Default value is `1`.
     *
     * @deprecated Field 'version' has been deprecated from version 1.49.0, and use field 'document' to replace. 
     */
    version?: pulumi.Input<string>;
}
