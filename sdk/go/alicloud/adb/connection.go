// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package adb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides an ADB connection resource to allocate an Internet connection string for ADB cluster.
//
// > **NOTE:** Each ADB instance will allocate a intranet connnection string automatically and its prifix is ADB instance ID.
//
//	To avoid unnecessary conflict, please specified a internet connection prefix before applying the resource.
//
// > **NOTE:** Available since v1.81.0.
//
// ## Example Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/adb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			cfg := config.New(ctx, "")
//			name := "terraform-example"
//			if param := cfg.Get("name"); param != "" {
//				name = param
//			}
//			defaultZones, err := adb.GetZones(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, &resourcemanager.GetResourceGroupsArgs{
//				Status: pulumi.StringRef("OK"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultNetwork, err := vpc.NewNetwork(ctx, "defaultNetwork", &vpc.NetworkArgs{
//				VpcName:   pulumi.String(name),
//				CidrBlock: pulumi.String("10.4.0.0/16"),
//			})
//			if err != nil {
//				return err
//			}
//			defaultSwitch, err := vpc.NewSwitch(ctx, "defaultSwitch", &vpc.SwitchArgs{
//				VpcId:       defaultNetwork.ID(),
//				CidrBlock:   pulumi.String("10.4.0.0/24"),
//				ZoneId:      *pulumi.String(defaultZones.Zones[0].Id),
//				VswitchName: pulumi.String(name),
//			})
//			if err != nil {
//				return err
//			}
//			defaultDBCluster, err := adb.NewDBCluster(ctx, "defaultDBCluster", &adb.DBClusterArgs{
//				DbClusterCategory: pulumi.String("Cluster"),
//				DbNodeClass:       pulumi.String("C8"),
//				DbNodeCount:       pulumi.Int(4),
//				DbNodeStorage:     pulumi.Int(400),
//				Mode:              pulumi.String("reserver"),
//				DbClusterVersion:  pulumi.String("3.0"),
//				PaymentType:       pulumi.String("PayAsYouGo"),
//				VswitchId:         defaultSwitch.ID(),
//				Description:       pulumi.String(name),
//				MaintainTime:      pulumi.String("23:00Z-00:00Z"),
//				ResourceGroupId:   *pulumi.String(defaultResourceGroups.Ids[0]),
//				SecurityIps: pulumi.StringArray{
//					pulumi.String("10.168.1.12"),
//					pulumi.String("10.168.1.11"),
//				},
//				Tags: pulumi.AnyMap{
//					"Created": pulumi.Any("TF"),
//					"For":     pulumi.Any("example"),
//				},
//			})
//			if err != nil {
//				return err
//			}
//			_, err = adb.NewConnection(ctx, "defaultConnection", &adb.ConnectionArgs{
//				DbClusterId:      defaultDBCluster.ID(),
//				ConnectionPrefix: pulumi.String("example"),
//			})
//			if err != nil {
//				return err
//			}
//			return nil
//		})
//	}
//
// ```
//
// ## Import
//
// ADB connection can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:adb/connection:Connection example am-12345678
//
// ```
type Connection struct {
	pulumi.CustomResourceState

	// Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `<db_cluster_id> + tf`.
	ConnectionPrefix pulumi.StringOutput `pulumi:"connectionPrefix"`
	// Connection cluster string.
	ConnectionString pulumi.StringOutput `pulumi:"connectionString"`
	// The Id of cluster that can run database.
	DbClusterId pulumi.StringOutput `pulumi:"dbClusterId"`
	// The ip address of connection string.
	IpAddress pulumi.StringOutput `pulumi:"ipAddress"`
	// Connection cluster port.
	Port pulumi.StringOutput `pulumi:"port"`
}

// NewConnection registers a new resource with the given unique name, arguments, and options.
func NewConnection(ctx *pulumi.Context,
	name string, args *ConnectionArgs, opts ...pulumi.ResourceOption) (*Connection, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.DbClusterId == nil {
		return nil, errors.New("invalid value for required argument 'DbClusterId'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource Connection
	err := ctx.RegisterResource("alicloud:adb/connection:Connection", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetConnection gets an existing Connection resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetConnection(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ConnectionState, opts ...pulumi.ResourceOption) (*Connection, error) {
	var resource Connection
	err := ctx.ReadResource("alicloud:adb/connection:Connection", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering Connection resources.
type connectionState struct {
	// Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `<db_cluster_id> + tf`.
	ConnectionPrefix *string `pulumi:"connectionPrefix"`
	// Connection cluster string.
	ConnectionString *string `pulumi:"connectionString"`
	// The Id of cluster that can run database.
	DbClusterId *string `pulumi:"dbClusterId"`
	// The ip address of connection string.
	IpAddress *string `pulumi:"ipAddress"`
	// Connection cluster port.
	Port *string `pulumi:"port"`
}

type ConnectionState struct {
	// Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `<db_cluster_id> + tf`.
	ConnectionPrefix pulumi.StringPtrInput
	// Connection cluster string.
	ConnectionString pulumi.StringPtrInput
	// The Id of cluster that can run database.
	DbClusterId pulumi.StringPtrInput
	// The ip address of connection string.
	IpAddress pulumi.StringPtrInput
	// Connection cluster port.
	Port pulumi.StringPtrInput
}

func (ConnectionState) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionState)(nil)).Elem()
}

type connectionArgs struct {
	// Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `<db_cluster_id> + tf`.
	ConnectionPrefix *string `pulumi:"connectionPrefix"`
	// The Id of cluster that can run database.
	DbClusterId string `pulumi:"dbClusterId"`
}

// The set of arguments for constructing a Connection resource.
type ConnectionArgs struct {
	// Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `<db_cluster_id> + tf`.
	ConnectionPrefix pulumi.StringPtrInput
	// The Id of cluster that can run database.
	DbClusterId pulumi.StringInput
}

func (ConnectionArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*connectionArgs)(nil)).Elem()
}

type ConnectionInput interface {
	pulumi.Input

	ToConnectionOutput() ConnectionOutput
	ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput
}

func (*Connection) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (i *Connection) ToConnectionOutput() ConnectionOutput {
	return i.ToConnectionOutputWithContext(context.Background())
}

func (i *Connection) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionOutput)
}

func (i *Connection) ToOutput(ctx context.Context) pulumix.Output[*Connection] {
	return pulumix.Output[*Connection]{
		OutputState: i.ToConnectionOutputWithContext(ctx).OutputState,
	}
}

// ConnectionArrayInput is an input type that accepts ConnectionArray and ConnectionArrayOutput values.
// You can construct a concrete instance of `ConnectionArrayInput` via:
//
//	ConnectionArray{ ConnectionArgs{...} }
type ConnectionArrayInput interface {
	pulumi.Input

	ToConnectionArrayOutput() ConnectionArrayOutput
	ToConnectionArrayOutputWithContext(context.Context) ConnectionArrayOutput
}

type ConnectionArray []ConnectionInput

func (ConnectionArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (i ConnectionArray) ToConnectionArrayOutput() ConnectionArrayOutput {
	return i.ToConnectionArrayOutputWithContext(context.Background())
}

func (i ConnectionArray) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionArrayOutput)
}

func (i ConnectionArray) ToOutput(ctx context.Context) pulumix.Output[[]*Connection] {
	return pulumix.Output[[]*Connection]{
		OutputState: i.ToConnectionArrayOutputWithContext(ctx).OutputState,
	}
}

// ConnectionMapInput is an input type that accepts ConnectionMap and ConnectionMapOutput values.
// You can construct a concrete instance of `ConnectionMapInput` via:
//
//	ConnectionMap{ "key": ConnectionArgs{...} }
type ConnectionMapInput interface {
	pulumi.Input

	ToConnectionMapOutput() ConnectionMapOutput
	ToConnectionMapOutputWithContext(context.Context) ConnectionMapOutput
}

type ConnectionMap map[string]ConnectionInput

func (ConnectionMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (i ConnectionMap) ToConnectionMapOutput() ConnectionMapOutput {
	return i.ToConnectionMapOutputWithContext(context.Background())
}

func (i ConnectionMap) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ConnectionMapOutput)
}

func (i ConnectionMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*Connection] {
	return pulumix.Output[map[string]*Connection]{
		OutputState: i.ToConnectionMapOutputWithContext(ctx).OutputState,
	}
}

type ConnectionOutput struct{ *pulumi.OutputState }

func (ConnectionOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**Connection)(nil)).Elem()
}

func (o ConnectionOutput) ToConnectionOutput() ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToConnectionOutputWithContext(ctx context.Context) ConnectionOutput {
	return o
}

func (o ConnectionOutput) ToOutput(ctx context.Context) pulumix.Output[*Connection] {
	return pulumix.Output[*Connection]{
		OutputState: o.OutputState,
	}
}

// Prefix of the cluster public endpoint. The prefix must be 6 to 30 characters in length, and can contain lowercase letters, digits, and hyphens (-), must start with a letter and end with a digit or letter. Default to `<db_cluster_id> + tf`.
func (o ConnectionOutput) ConnectionPrefix() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.ConnectionPrefix }).(pulumi.StringOutput)
}

// Connection cluster string.
func (o ConnectionOutput) ConnectionString() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.ConnectionString }).(pulumi.StringOutput)
}

// The Id of cluster that can run database.
func (o ConnectionOutput) DbClusterId() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.DbClusterId }).(pulumi.StringOutput)
}

// The ip address of connection string.
func (o ConnectionOutput) IpAddress() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.IpAddress }).(pulumi.StringOutput)
}

// Connection cluster port.
func (o ConnectionOutput) Port() pulumi.StringOutput {
	return o.ApplyT(func(v *Connection) pulumi.StringOutput { return v.Port }).(pulumi.StringOutput)
}

type ConnectionArrayOutput struct{ *pulumi.OutputState }

func (ConnectionArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*Connection)(nil)).Elem()
}

func (o ConnectionArrayOutput) ToConnectionArrayOutput() ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToConnectionArrayOutputWithContext(ctx context.Context) ConnectionArrayOutput {
	return o
}

func (o ConnectionArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*Connection] {
	return pulumix.Output[[]*Connection]{
		OutputState: o.OutputState,
	}
}

func (o ConnectionArrayOutput) Index(i pulumi.IntInput) ConnectionOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].([]*Connection)[vs[1].(int)]
	}).(ConnectionOutput)
}

type ConnectionMapOutput struct{ *pulumi.OutputState }

func (ConnectionMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*Connection)(nil)).Elem()
}

func (o ConnectionMapOutput) ToConnectionMapOutput() ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToConnectionMapOutputWithContext(ctx context.Context) ConnectionMapOutput {
	return o
}

func (o ConnectionMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*Connection] {
	return pulumix.Output[map[string]*Connection]{
		OutputState: o.OutputState,
	}
}

func (o ConnectionMapOutput) MapIndex(k pulumi.StringInput) ConnectionOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *Connection {
		return vs[0].(map[string]*Connection)[vs[1].(string)]
	}).(ConnectionOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionInput)(nil)).Elem(), &Connection{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionArrayInput)(nil)).Elem(), ConnectionArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ConnectionMapInput)(nil)).Elem(), ConnectionMap{})
	pulumi.RegisterOutputType(ConnectionOutput{})
	pulumi.RegisterOutputType(ConnectionArrayOutput{})
	pulumi.RegisterOutputType(ConnectionMapOutput{})
}
