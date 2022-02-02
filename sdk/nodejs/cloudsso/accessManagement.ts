// *** WARNING: this file was generated by the Pulumi Terraform Bridge (tfgen) Tool. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

import * as pulumi from "@pulumi/pulumi";
import * as utilities from "../utilities";

/**
 * Provides a Cloud SSO Access Assignment resource.
 *
 * For information about Cloud SSO Access Assignment and how to use it, see [What is Access Assignment](https://www.alibabacloud.com/help/en/doc-detail/265996.htm).
 *
 * > **NOTE:** When you configure access assignment for the first time, access configuration will be automatically deployed.
 *
 * > **NOTE:** Available in v1.145.0+.
 *
 * > **NOTE:** Cloud SSO Only Support `cn-shanghai` And `us-west-1` Region
 *
 * ## Import
 *
 * Cloud SSO Access Assignment can be imported using the id, e.g.
 *
 * ```sh
 *  $ pulumi import alicloud:cloudsso/accessManagement:AccessManagement example <directory_id>:<access_configuration_id>:<target_type>:<target_id>:<principal_type>:<principal_id>
 * ```
 */
export class AccessManagement extends pulumi.CustomResource {
    /**
     * Get an existing AccessManagement resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     * @param opts Optional settings to control the behavior of the CustomResource.
     */
    public static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AccessManagementState, opts?: pulumi.CustomResourceOptions): AccessManagement {
        return new AccessManagement(name, <any>state, { ...opts, id: id });
    }

    /** @internal */
    public static readonly __pulumiType = 'alicloud:cloudsso/accessManagement:AccessManagement';

    /**
     * Returns true if the given object is an instance of AccessManagement.  This is designed to work even
     * when multiple copies of the Pulumi SDK have been loaded into the same process.
     */
    public static isInstance(obj: any): obj is AccessManagement {
        if (obj === undefined || obj === null) {
            return false;
        }
        return obj['__pulumiType'] === AccessManagement.__pulumiType;
    }

    /**
     * The Access configuration ID.
     */
    public readonly accessConfigurationId!: pulumi.Output<string>;
    /**
     * The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovisionStrategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
     */
    public readonly deprovisionStrategy!: pulumi.Output<string | undefined>;
    /**
     * The ID of the Directory.
     */
    public readonly directoryId!: pulumi.Output<string>;
    /**
     * The ID of the access assignment.
     */
    public readonly principalId!: pulumi.Output<string>;
    /**
     * The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
     */
    public readonly principalType!: pulumi.Output<string>;
    /**
     * The ID of the target to create the resource range.
     */
    public readonly targetId!: pulumi.Output<string>;
    /**
     * The type of the resource range target to be accessed. Valid values: `RD-Account`.
     */
    public readonly targetType!: pulumi.Output<string>;

    /**
     * Create a AccessManagement resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: AccessManagementArgs, opts?: pulumi.CustomResourceOptions)
    constructor(name: string, argsOrState?: AccessManagementArgs | AccessManagementState, opts?: pulumi.CustomResourceOptions) {
        let resourceInputs: pulumi.Inputs = {};
        opts = opts || {};
        if (opts.id) {
            const state = argsOrState as AccessManagementState | undefined;
            resourceInputs["accessConfigurationId"] = state ? state.accessConfigurationId : undefined;
            resourceInputs["deprovisionStrategy"] = state ? state.deprovisionStrategy : undefined;
            resourceInputs["directoryId"] = state ? state.directoryId : undefined;
            resourceInputs["principalId"] = state ? state.principalId : undefined;
            resourceInputs["principalType"] = state ? state.principalType : undefined;
            resourceInputs["targetId"] = state ? state.targetId : undefined;
            resourceInputs["targetType"] = state ? state.targetType : undefined;
        } else {
            const args = argsOrState as AccessManagementArgs | undefined;
            if ((!args || args.accessConfigurationId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'accessConfigurationId'");
            }
            if ((!args || args.directoryId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'directoryId'");
            }
            if ((!args || args.principalId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principalId'");
            }
            if ((!args || args.principalType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'principalType'");
            }
            if ((!args || args.targetId === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetId'");
            }
            if ((!args || args.targetType === undefined) && !opts.urn) {
                throw new Error("Missing required property 'targetType'");
            }
            resourceInputs["accessConfigurationId"] = args ? args.accessConfigurationId : undefined;
            resourceInputs["deprovisionStrategy"] = args ? args.deprovisionStrategy : undefined;
            resourceInputs["directoryId"] = args ? args.directoryId : undefined;
            resourceInputs["principalId"] = args ? args.principalId : undefined;
            resourceInputs["principalType"] = args ? args.principalType : undefined;
            resourceInputs["targetId"] = args ? args.targetId : undefined;
            resourceInputs["targetType"] = args ? args.targetType : undefined;
        }
        opts = pulumi.mergeOptions(utilities.resourceOptsDefaults(), opts);
        super(AccessManagement.__pulumiType, name, resourceInputs, opts);
    }
}

/**
 * Input properties used for looking up and filtering AccessManagement resources.
 */
export interface AccessManagementState {
    /**
     * The Access configuration ID.
     */
    accessConfigurationId?: pulumi.Input<string>;
    /**
     * The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovisionStrategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
     */
    deprovisionStrategy?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId?: pulumi.Input<string>;
    /**
     * The ID of the access assignment.
     */
    principalId?: pulumi.Input<string>;
    /**
     * The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
     */
    principalType?: pulumi.Input<string>;
    /**
     * The ID of the target to create the resource range.
     */
    targetId?: pulumi.Input<string>;
    /**
     * The type of the resource range target to be accessed. Valid values: `RD-Account`.
     */
    targetType?: pulumi.Input<string>;
}

/**
 * The set of arguments for constructing a AccessManagement resource.
 */
export interface AccessManagementArgs {
    /**
     * The Access configuration ID.
     */
    accessConfigurationId: pulumi.Input<string>;
    /**
     * The deprovision strategy. Valid values: `DeprovisionForLastAccessAssignmentOnAccount` and `None`. Default Value: `DeprovisionForLastAccessAssignmentOnAccount`. **NOTE:** When `deprovisionStrategy` is `DeprovisionForLastAccessAssignmentOnAccount`, and the access assignment to be deleted is the last access assignment for the same account and the same AC, this option is used for the undeployment operation。
     */
    deprovisionStrategy?: pulumi.Input<string>;
    /**
     * The ID of the Directory.
     */
    directoryId: pulumi.Input<string>;
    /**
     * The ID of the access assignment.
     */
    principalId: pulumi.Input<string>;
    /**
     * The identity type of the access assignment, which can be a user or a user group. Valid values: `Group`, `User`.
     */
    principalType: pulumi.Input<string>;
    /**
     * The ID of the target to create the resource range.
     */
    targetId: pulumi.Input<string>;
    /**
     * The type of the resource range target to be accessed. Valid values: `RD-Account`.
     */
    targetType: pulumi.Input<string>;
}
