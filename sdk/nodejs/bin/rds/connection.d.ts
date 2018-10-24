import * as pulumi from "@pulumi/pulumi";
/**
 * Provides an RDS connection resource to allocate an Internet connection string for RDS instance.
 *
 * ~> **NOTE:** Each RDS instance will allocate a intranet connnection string automatically and its prifix is RDS instance ID.
 *  To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
 */
export declare class Connection extends pulumi.CustomResource {
    /**
     * Get an existing Connection resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: ConnectionState): Connection;
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'tf'.
     */
    readonly connectionPrefix: pulumi.Output<string>;
    /**
     * Connection instance string.
     */
    readonly connectionString: pulumi.Output<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Output<string>;
    /**
     * The ip address of connection string.
     */
    readonly ipAddress: pulumi.Output<string>;
    /**
     * Internet connection port. Valid value: [3001-3999]. Default to 3306.
     */
    readonly port: pulumi.Output<string | undefined>;
    /**
     * Create a Connection resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args: ConnectionArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Connection resources.
 */
export interface ConnectionState {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'tf'.
     */
    readonly connectionPrefix?: pulumi.Input<string>;
    /**
     * Connection instance string.
     */
    readonly connectionString?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId?: pulumi.Input<string>;
    /**
     * The ip address of connection string.
     */
    readonly ipAddress?: pulumi.Input<string>;
    /**
     * Internet connection port. Valid value: [3001-3999]. Default to 3306.
     */
    readonly port?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Connection resource.
 */
export interface ConnectionArgs {
    /**
     * Prefix of an Internet connection string. It must be checked for uniqueness. It may consist of lowercase letters, numbers, and underlines, and must start with a letter and have no more than 30 characters. Default to <instance_id> + 'tf'.
     */
    readonly connectionPrefix?: pulumi.Input<string>;
    /**
     * The Id of instance that can run database.
     */
    readonly instanceId: pulumi.Input<string>;
    /**
     * Internet connection port. Valid value: [3001-3999]. Default to 3306.
     */
    readonly port?: pulumi.Input<string>;
}