// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a RAM User access key resource.
 * 
 * ~> **NOTE:**  You should set the `secret_file` if you want to get the access key.  
 */
export class AccessKey extends pulumi.CustomResource {
    /**
     * Get an existing AccessKey resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessKeyState): AccessKey {
        return new AccessKey(name, <any>state, { id });
    }

    /**
     * The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
     */
    public readonly secretFile: pulumi.Output<string | undefined>;
    /**
     * Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     */
    public readonly status: pulumi.Output<string | undefined>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    public readonly userName: pulumi.Output<string | undefined>;

    /**
     * Create a AccessKey resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AccessKeyArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessKeyArgs | AccessKeyState, opts?: pulumi.CustomResourceOptions) {
        let inputs: pulumi.Inputs = {};
        if (opts && opts.id) {
            const state: AccessKeyState = argsOrState as AccessKeyState | undefined;
            inputs["secretFile"] = state ? state.secretFile : undefined;
            inputs["status"] = state ? state.status : undefined;
            inputs["userName"] = state ? state.userName : undefined;
        } else {
            const args = argsOrState as AccessKeyArgs | undefined;
            inputs["secretFile"] = args ? args.secretFile : undefined;
            inputs["status"] = args ? args.status : undefined;
            inputs["userName"] = args ? args.userName : undefined;
        }
        super("alicloud:ram/accessKey:AccessKey", name, inputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessKey resources.
 */
export interface AccessKeyState {
    /**
     * The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
     */
    readonly secretFile?: pulumi.Input<string>;
    /**
     * Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessKey resource.
 */
export interface AccessKeyArgs {
    /**
     * The name of file that can save access key id and access key secret. Strongly suggest you to specified it when you creating access key, otherwise, you wouldn't get its secret ever.
     */
    readonly secretFile?: pulumi.Input<string>;
    /**
     * Status of access key. It must be `Active` or `Inactive`. Default value is `Active`.
     */
    readonly status?: pulumi.Input<string>;
    /**
     * Name of the RAM user. This name can have a string of 1 to 64 characters, must contain only alphanumeric characters or hyphens, such as "-",".","_", and must not begin with a hyphen.
     */
    readonly userName?: pulumi.Input<string>;
}