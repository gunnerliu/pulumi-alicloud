// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Create an alias for the master key (CMK).
 * 
 * > **NOTE:** Available in v1.77.0+.
 * 
 * ## Example Usage
 * 
 * 
 * 
 * ```typescript
 * import * as pulumi from "@pulumi/pulumi";
 * import * as alicloud from "@pulumi/alicloud";
 * 
 * const thisKey = new alicloud.kms.Key("thisKey", {});
 * const thisAlias = new alicloud.kms.Alias("thisAlias", {
 *     aliasName: "alias/test_kms_alias",
 *     keyId: thisKey.id,
 * });
 * ```
 *
 * > This content is derived from https://github.com/terraform-providers/terraform-provider-alicloud/blob/master/website/docs/r/kms_alias.html.markdown.
 */
export class Alias extends pulumi.CustomResource {
    /**
     * Get an existing Alias resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AliasState, opts?: pulumi.CustomResourceOptions): Alias {
        return new Alias(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:kms/alias:Alias';

    /**
     * Returns true if the given object is an instance of Alias.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is Alias {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === Alias.__pulumiType;
    }

    /**
     * The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     */
    public readonly aliasName!: pulumi.Output<string>;
    /**
     * The id of the key.
     */
    public readonly keyId!: pulumi.Output<string>;

    /**
     * Create a Alias resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AliasArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AliasArgs | AliasState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state = argsOrState as AliasState | undefined;
            inputs["aliasName"] = state ? state.aliasName : undefined;
            inputs["keyId"] = state ? state.keyId : undefined;
        } else {
            const args = argsOrState as AliasArgs | undefined;
            if (!args || args.aliasName === undefined) {
                throw new Error("Missing required property 'aliasName'");
            }
            if (!args || args.keyId === undefined) {
                throw new Error("Missing required property 'keyId'");
            }
            inputs["aliasName"] = args ? args.aliasName : undefined;
            inputs["keyId"] = args ? args.keyId : undefined;
        }
        if (!opts) {
            opts = {}
        }

        if (!opts.version) {
            opts.version = utilities.getVersion();
        }
        super(Alias.__pulumiType, name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering Alias resources.
 */
export interface AliasState {
    /**
     * The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     */
    readonly aliasName?: pulumi.Input<string>;
    /**
     * The id of the key.
     */
    readonly keyId?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a Alias resource.
 */
export interface AliasArgs {
    /**
     * The alias of CMK. `Encrypt`、`GenerateDataKey`、`DescribeKey` can be called using aliases. Length of characters other than prefixes: minimum length of 1 character and maximum length of 255 characters. Must contain prefix `alias/`.
     */
    readonly aliasName: pulumi.Input<string>;
    /**
     * The id of the key.
     */
    readonly keyId: pulumi.Input<string>;
}
