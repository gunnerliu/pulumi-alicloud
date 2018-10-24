import * as pulumi from "@pulumi/pulumi";
/**
 * An access control list contains multiple IP addresses or CIDR blocks.
 * The access control list can help you to define multiple instance listening dimension,
 * and to meet the multiple usage for single access control list.
 *
 * Server Load Balancer allows you to configure access control for listeners.
 * You can configure different whitelists or blacklists for different listeners.
 *
 * You can configure access control
 * when you create a listener or change access control configuration after a listener is created.
 *
 * ~> **NOTE:** One access control list can be attached to many Listeners in different load balancer as whitelists or blacklists.
 *
 * ~> **NOTE:** The maximum number of access control lists per region  is 50.
 *
 * ~> **NOTE:** The maximum number of IP addresses added each time is 50.
 *
 * ~> **NOTE:** The maximum number of entries per access control list is 300.
 *
 * ~> **NOTE:** The maximum number of listeners that an access control list can be added to is 50.
 *
 * For information about slb and how to use it, see [What is Server Load Balancer](https://www.alibabacloud.com/help/doc-detail/27539.htm).
 *
 * For information about acl and how to use it, see [Configure an access control list](https://www.alibabacloud.com/help/doc-detail/85978.htm).
 *
 */
export declare class Acl extends pulumi.CustomResource {
    /**
     * Get an existing Acl resource's state with the given name, ID, and optional extra
     * properties used to qualify the lookup.
     *
     * @param name The _unique_ name of the resulting resource.
     * @param id The _unique_ provider ID of the resource to lookup.
     * @param state Any extra arguments used during the lookup.
     */
    static get(name: string, id: pulumi.Input<pulumi.ID>, state?: AclState): Acl;
    /**
     * A list of entry (IP addresses or CIDR blocks) to be added. At most 50 etnry can be supported in one resource. It contains two sub-fields as `Entry Block` follows.
     */
    readonly entryLists: pulumi.Output<{
        comment?: string;
        entry: string;
    }[] | undefined>;
    /**
     * The IP Version of access control list is the type of its entry (IP addresses or CIDR blocks). It values ipv4/ipv6. Our plugin provides a default ip_version: "ipv4".
     */
    readonly ipVersion: pulumi.Output<string | undefined>;
    /**
     * Name of the access control list.
     */
    readonly name: pulumi.Output<string>;
    /**
     * Create a Acl resource with the given unique name, arguments, and options.
     *
     * @param name The _unique_ name of the resource.
     * @param args The arguments to use to populate this resource's properties.
     * @param opts A bag of options that control this resource's behavior.
     */
    constructor(name: string, args?: AclArgs, opts?: pulumi.CustomResourceOptions);
}
/**
 * Input properties used for looking up and filtering Acl resources.
 */
export interface AclState {
    /**
     * A list of entry (IP addresses or CIDR blocks) to be added. At most 50 etnry can be supported in one resource. It contains two sub-fields as `Entry Block` follows.
     */
    readonly entryLists?: pulumi.Input<pulumi.Input<{
        comment?: pulumi.Input<string>;
        entry: pulumi.Input<string>;
    }>[]>;
    /**
     * The IP Version of access control list is the type of its entry (IP addresses or CIDR blocks). It values ipv4/ipv6. Our plugin provides a default ip_version: "ipv4".
     */
    readonly ipVersion?: pulumi.Input<string>;
    /**
     * Name of the access control list.
     */
    readonly name?: pulumi.Input<string>;
}
/**
 * The set of arguments for constructing a Acl resource.
 */
export interface AclArgs {
    /**
     * A list of entry (IP addresses or CIDR blocks) to be added. At most 50 etnry can be supported in one resource. It contains two sub-fields as `Entry Block` follows.
     */
    readonly entryLists?: pulumi.Input<pulumi.Input<{
        comment?: pulumi.Input<string>;
        entry: pulumi.Input<string>;
    }>[]>;
    /**
     * The IP Version of access control list is the type of its entry (IP addresses or CIDR blocks). It values ipv4/ipv6. Our plugin provides a default ip_version: "ipv4".
     */
    readonly ipVersion?: pulumi.Input<string>;
    /**
     * Name of the access control list.
     */
    readonly name?: pulumi.Input<string>;
}