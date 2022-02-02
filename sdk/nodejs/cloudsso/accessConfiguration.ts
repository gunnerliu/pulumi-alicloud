// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import { input as inputs, output as outputs } from "../types";
import * as utilities from "../utilities";

/**
 * Provides a Cloud SSO Access Configuration resource.
 *
 * For information about Cloud SSO Access Configuration and how to use it, see [What is Access Configuration](https://www.alibabacloud.com/help/en/doc-detail/266737.html).
 *
 * > **NOTE:** Available in v1.145.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Import
 *
 * Cloud SSO Access Configuration can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudsso/accessConfiguration:AccessConfiguration example <directory_id>:<access_configuration_id>
 * ```
 */
export class AccessConfiguration extends pulumi.CustomResource {
    /**
     * Get an existing AccessConfiguration resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessConfigurationState, opts?: pulumi.CustomResourceOptions): AccessConfiguration {
        return new AccessConfiguration(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudsso/accessConfiguration:AccessConfiguration';

    /**
     * Returns true if the given object is an instance of AccessConfiguration.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessConfiguration {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessConfiguration.__pulumiType;
    }

    /**
     * The AccessConfigurationId of the Access Configuration.
     */
    public /*out*/ readonly accessConfigurationId!: pulumi.Output<string>;
    /**
     * The AccessConfigurationName of the Access Configuration. The name of the resource. The name can be up to `32` characters long and can contain letters, digits, and hyphens (-).
     */
    public readonly accessConfigurationName!: pulumi.Output<string>;
    /**
     * The Description of the  Access Configuration. The description can be up to `1024` characters long.
     */
    public readonly description!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Directory.
     */
    public readonly directoryId!: pulumi.Output<string>;
    /**
     * This parameter is used to force deletion `permissionPolicies`. Valid Value: `true` and `false`.
     */
    public readonly forceRemovePermissionPolicies!: pulumi.Output<boolean | undefined>;
    /**
     * The Policy List. See the following `Block permissionPolicies`.
     */
    public readonly permissionPolicies!: pulumi.Output<outputs.cloudsso.AccessConfigurationPermissionPolicy[] | undefined>;
    /**
     * The RelayState of the Access Configuration, Cloud SSO users use this access configuration to access the RD account, the initial access page address. Must be the Alibaba Cloud console page, the default is the console home page.
     */
    public readonly relayState!: pulumi.Output<string | undefined>;
    /**
     * The SessionDuration of the Access Configuration. Valid Value: `900` to `43200`. Unit: Seconds.
     */
    public readonly sessionDuration!: pulumi.Output<number>;

    /**
     * Create a AccessConfiguration resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessConfigurationArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessConfigurationArgs | AccessConfigurationState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessConfigurationState | undefined;
            resourceInputs["accessConfigurationId"] = state ? state.accessConfigurationId : undefined;
            resourceInputs["accessConfigurationName"] = state ? state.accessConfigurationName : undefined;
            resourceInputs["description"] = state ? state.description : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["forceRemovePermissionPolicies"] = state ? state.forceRemovePermissionPolicies : undefined;
            resourceInputs["permissionPolicies"] = state ? state.permissionPolicies : undefined;
            resourceInputs["relayState"] = state ? state.relayState : undefined;
            resourceInputs["sessionDuration"] = state ? state.sessionDuration : undefined;
        } else {
            const args = argsOrState as AccessConfigurationArgs | undefined;
            if ((!args || args.accessConfigurationName === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessConfigurationName'");
            }
            if ((!args || args.directoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'directoryId'");
            }
            resourceInputs["accessConfigurationName"] = args ? args.accessConfigurationName : undefined;
            resourceInputs["description"] = args ? args.description : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["forceRemovePermissionPolicies"] = args ? args.forceRemovePermissionPolicies : undefined;
            resourceInputs["permissionPolicies"] = args ? args.permissionPolicies : undefined;
            resourceInputs["relayState"] = args ? args.relayState : undefined;
            resourceInputs["sessionDuration"] = args ? args.sessionDuration : undefined;
            resourceInputs["accessConfigurationId"] = undefined /*out*/;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessConfiguration.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessConfiguration resources.
 */
export interface AccessConfigurationState {
    /**
     * The AccessConfigurationId of the Access Configuration.
     */
    accessConfigurationId?: pulumi.Input<string>;
    /**
     * The AccessConfigurationName of the Access Configuration. The name of the resource. The name can be up to `32` characters long and can contain letters, digits, and hyphens (-).
     */
    accessConfigurationName?: pulumi.Input<string>;
    /**
     * The Description of the  Access Configuration. The description can be up to `1024` characters long.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * This parameter is used to force deletion `permissionPolicies`. Valid Value: `true` and `false`.
     */
    forceRemovePermissionPolicies?: pulumi.Input<boolean>;
    /**
     * The Policy List. See the following `Block permissionPolicies`.
     */
    permissionPolicies?: pulumi.Input<pulumi.Input<inputs.cloudsso.AccessConfigurationPermissionPolicy>[]>;
    /**
     * The RelayState of the Access Configuration, Cloud SSO users use this access configuration to access the RD account, the initial access page address. Must be the Alibaba Cloud console page, the default is the console home page.
     */
    relayState?: pulumi.Input<string>;
    /**
     * The SessionDuration of the Access Configuration. Valid Value: `900` to `43200`. Unit: Seconds.
     */
    sessionDuration?: pulumi.Input<number>;
}

/**
 * The set of arguments for constructing a AccessConfiguration resource.
 */
export interface AccessConfigurationArgs {
    /**
     * The AccessConfigurationName of the Access Configuration. The name of the resource. The name can be up to `32` characters long and can contain letters, digits, and hyphens (-).
     */
    accessConfigurationName: pulumi.Input<string>;
    /**
     * The Description of the  Access Configuration. The description can be up to `1024` characters long.
     */
    description?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * This parameter is used to force deletion `permissionPolicies`. Valid Value: `true` and `false`.
     */
    forceRemovePermissionPolicies?: pulumi.Input<boolean>;
    /**
     * The Policy List. See the following `Block permissionPolicies`.
     */
    permissionPolicies?: pulumi.Input<pulumi.Input<inputs.cloudsso.AccessConfigurationPermissionPolicy>[]>;
    /**
     * The RelayState of the Access Configuration, Cloud SSO users use this access configuration to access the RD account, the initial access page address. Must be the Alibaba Cloud console page, the default is the console home page.
     */
    relayState?: pulumi.Input<string>;
    /**
     * The SessionDuration of the Access Configuration. Valid Value: `900` to `43200`. Unit: Seconds.
     */
    sessionDuration?: pulumi.Input<number>;
}
