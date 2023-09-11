// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package nlb

import (
	"context"
	"reflect"

	"errors"
	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/internal"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumix"
)

// Provides a NLB Server Group Server Attachment resource.
//
// For information about NLB Server Group Server Attachment and how to use it, see [What is Server Group Server Attachment](https://www.alibabacloud.com/help/en/server-load-balancer/latest/addserverstoservergroup-nlb).
//
// > **NOTE:** Available in v1.192.0+.
//
// ## Example Usage
//
// # Basic Usage
//
// ```go
// package main
//
// import (
//
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/nlb"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
//	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/vpc"
//	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
//
// )
//
//	func main() {
//		pulumi.Run(func(ctx *pulumi.Context) error {
//			defaultNetworks, err := vpc.GetNetworks(ctx, &vpc.GetNetworksArgs{
//				NameRegex: pulumi.StringRef("default-NODELETING"),
//			}, nil)
//			if err != nil {
//				return err
//			}
//			defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, nil, nil)
//			if err != nil {
//				return err
//			}
//			defaultServerGroup, err := nlb.NewServerGroup(ctx, "defaultServerGroup", &nlb.ServerGroupArgs{
//				ResourceGroupId: *pulumi.String(defaultResourceGroups.Ids[0]),
//				ServerGroupName: pulumi.Any(_var.Name),
//				ServerGroupType: pulumi.String("Ip"),
//				VpcId:           *pulumi.String(defaultNetworks.Ids[0]),
//				Scheduler:       pulumi.String("Wrr"),
//				Protocol:        pulumi.String("TCP"),
//				HealthCheck: &nlb.ServerGroupHealthCheckArgs{
//					HealthCheckEnabled: pulumi.Bool(false),
//				},
//				AddressIpVersion: pulumi.String("Ipv4"),
//			})
//			if err != nil {
//				return err
//			}
//			_, err = nlb.NewServerGroupServerAttachment(ctx, "defaultServerGroupServerAttachment", &nlb.ServerGroupServerAttachmentArgs{
//				ServerType:    pulumi.String("Ip"),
//				ServerId:      pulumi.String("10.0.0.0"),
//				Description:   pulumi.Any(_var.Name),
//				Port:          pulumi.Int(80),
//				ServerGroupId: defaultServerGroup.ID(),
//				Weight:        pulumi.Int(100),
//				ServerIp:      pulumi.String("10.0.0.0"),
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
// NLB Server Group Server Attachment can be imported using the id, e.g.
//
// ```sh
//
//	$ pulumi import alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment example <server_group_id>:<server_id>:<server_type>:<port>
//
// ```
type ServerGroupServerAttachment struct {
	pulumi.CustomResourceState

	// The description of the servers. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
	Description pulumi.StringPtrOutput `pulumi:"description"`
	// The port used by the backend server. Valid values: 1 to 65535.
	Port pulumi.IntOutput `pulumi:"port"`
	// The ID of the server group.
	ServerGroupId pulumi.StringOutput `pulumi:"serverGroupId"`
	// The ID of the server.
	// - If the server group type is Instance, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by Ecs, Eni, or Eci.
	// - If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerId pulumi.StringOutput `pulumi:"serverId"`
	// The IP address of the server. If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerIp pulumi.StringOutput `pulumi:"serverIp"`
	// The type of the backend server. Valid values: `Ecs`, `Eni`, `Eci`, `Ip`.
	ServerType pulumi.StringOutput `pulumi:"serverType"`
	// Status of the server.
	Status pulumi.StringOutput `pulumi:"status"`
	// The weight of the backend server. Valid values: 0 to 100. Default value: 100. If the weight of a backend server is set to 0, no requests are forwarded to the backend server.
	Weight pulumi.IntOutput `pulumi:"weight"`
	// The zoneId of the server.
	ZoneId pulumi.StringOutput `pulumi:"zoneId"`
}

// NewServerGroupServerAttachment registers a new resource with the given unique name, arguments, and options.
func NewServerGroupServerAttachment(ctx *pulumi.Context,
	name string, args *ServerGroupServerAttachmentArgs, opts ...pulumi.ResourceOption) (*ServerGroupServerAttachment, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.Port == nil {
		return nil, errors.New("invalid value for required argument 'Port'")
	}
	if args.ServerGroupId == nil {
		return nil, errors.New("invalid value for required argument 'ServerGroupId'")
	}
	if args.ServerId == nil {
		return nil, errors.New("invalid value for required argument 'ServerId'")
	}
	if args.ServerType == nil {
		return nil, errors.New("invalid value for required argument 'ServerType'")
	}
	opts = internal.PkgResourceDefaultOpts(opts)
	var resource ServerGroupServerAttachment
	err := ctx.RegisterResource("alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetServerGroupServerAttachment gets an existing ServerGroupServerAttachment resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetServerGroupServerAttachment(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *ServerGroupServerAttachmentState, opts ...pulumi.ResourceOption) (*ServerGroupServerAttachment, error) {
	var resource ServerGroupServerAttachment
	err := ctx.ReadResource("alicloud:nlb/serverGroupServerAttachment:ServerGroupServerAttachment", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering ServerGroupServerAttachment resources.
type serverGroupServerAttachmentState struct {
	// The description of the servers. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
	Description *string `pulumi:"description"`
	// The port used by the backend server. Valid values: 1 to 65535.
	Port *int `pulumi:"port"`
	// The ID of the server group.
	ServerGroupId *string `pulumi:"serverGroupId"`
	// The ID of the server.
	// - If the server group type is Instance, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by Ecs, Eni, or Eci.
	// - If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerId *string `pulumi:"serverId"`
	// The IP address of the server. If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerIp *string `pulumi:"serverIp"`
	// The type of the backend server. Valid values: `Ecs`, `Eni`, `Eci`, `Ip`.
	ServerType *string `pulumi:"serverType"`
	// Status of the server.
	Status *string `pulumi:"status"`
	// The weight of the backend server. Valid values: 0 to 100. Default value: 100. If the weight of a backend server is set to 0, no requests are forwarded to the backend server.
	Weight *int `pulumi:"weight"`
	// The zoneId of the server.
	ZoneId *string `pulumi:"zoneId"`
}

type ServerGroupServerAttachmentState struct {
	// The description of the servers. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
	Description pulumi.StringPtrInput
	// The port used by the backend server. Valid values: 1 to 65535.
	Port pulumi.IntPtrInput
	// The ID of the server group.
	ServerGroupId pulumi.StringPtrInput
	// The ID of the server.
	// - If the server group type is Instance, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by Ecs, Eni, or Eci.
	// - If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerId pulumi.StringPtrInput
	// The IP address of the server. If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerIp pulumi.StringPtrInput
	// The type of the backend server. Valid values: `Ecs`, `Eni`, `Eci`, `Ip`.
	ServerType pulumi.StringPtrInput
	// Status of the server.
	Status pulumi.StringPtrInput
	// The weight of the backend server. Valid values: 0 to 100. Default value: 100. If the weight of a backend server is set to 0, no requests are forwarded to the backend server.
	Weight pulumi.IntPtrInput
	// The zoneId of the server.
	ZoneId pulumi.StringPtrInput
}

func (ServerGroupServerAttachmentState) ElementType() reflect.Type {
	return reflect.TypeOf((*serverGroupServerAttachmentState)(nil)).Elem()
}

type serverGroupServerAttachmentArgs struct {
	// The description of the servers. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
	Description *string `pulumi:"description"`
	// The port used by the backend server. Valid values: 1 to 65535.
	Port int `pulumi:"port"`
	// The ID of the server group.
	ServerGroupId string `pulumi:"serverGroupId"`
	// The ID of the server.
	// - If the server group type is Instance, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by Ecs, Eni, or Eci.
	// - If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerId string `pulumi:"serverId"`
	// The IP address of the server. If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerIp *string `pulumi:"serverIp"`
	// The type of the backend server. Valid values: `Ecs`, `Eni`, `Eci`, `Ip`.
	ServerType string `pulumi:"serverType"`
	// The weight of the backend server. Valid values: 0 to 100. Default value: 100. If the weight of a backend server is set to 0, no requests are forwarded to the backend server.
	Weight *int `pulumi:"weight"`
}

// The set of arguments for constructing a ServerGroupServerAttachment resource.
type ServerGroupServerAttachmentArgs struct {
	// The description of the servers. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
	Description pulumi.StringPtrInput
	// The port used by the backend server. Valid values: 1 to 65535.
	Port pulumi.IntInput
	// The ID of the server group.
	ServerGroupId pulumi.StringInput
	// The ID of the server.
	// - If the server group type is Instance, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by Ecs, Eni, or Eci.
	// - If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerId pulumi.StringInput
	// The IP address of the server. If the server group type is Ip, set the ServerId parameter to an IP address.
	ServerIp pulumi.StringPtrInput
	// The type of the backend server. Valid values: `Ecs`, `Eni`, `Eci`, `Ip`.
	ServerType pulumi.StringInput
	// The weight of the backend server. Valid values: 0 to 100. Default value: 100. If the weight of a backend server is set to 0, no requests are forwarded to the backend server.
	Weight pulumi.IntPtrInput
}

func (ServerGroupServerAttachmentArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*serverGroupServerAttachmentArgs)(nil)).Elem()
}

type ServerGroupServerAttachmentInput interface {
	pulumi.Input

	ToServerGroupServerAttachmentOutput() ServerGroupServerAttachmentOutput
	ToServerGroupServerAttachmentOutputWithContext(ctx context.Context) ServerGroupServerAttachmentOutput
}

func (*ServerGroupServerAttachment) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerGroupServerAttachment)(nil)).Elem()
}

func (i *ServerGroupServerAttachment) ToServerGroupServerAttachmentOutput() ServerGroupServerAttachmentOutput {
	return i.ToServerGroupServerAttachmentOutputWithContext(context.Background())
}

func (i *ServerGroupServerAttachment) ToServerGroupServerAttachmentOutputWithContext(ctx context.Context) ServerGroupServerAttachmentOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerGroupServerAttachmentOutput)
}

func (i *ServerGroupServerAttachment) ToOutput(ctx context.Context) pulumix.Output[*ServerGroupServerAttachment] {
	return pulumix.Output[*ServerGroupServerAttachment]{
		OutputState: i.ToServerGroupServerAttachmentOutputWithContext(ctx).OutputState,
	}
}

// ServerGroupServerAttachmentArrayInput is an input type that accepts ServerGroupServerAttachmentArray and ServerGroupServerAttachmentArrayOutput values.
// You can construct a concrete instance of `ServerGroupServerAttachmentArrayInput` via:
//
//	ServerGroupServerAttachmentArray{ ServerGroupServerAttachmentArgs{...} }
type ServerGroupServerAttachmentArrayInput interface {
	pulumi.Input

	ToServerGroupServerAttachmentArrayOutput() ServerGroupServerAttachmentArrayOutput
	ToServerGroupServerAttachmentArrayOutputWithContext(context.Context) ServerGroupServerAttachmentArrayOutput
}

type ServerGroupServerAttachmentArray []ServerGroupServerAttachmentInput

func (ServerGroupServerAttachmentArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerGroupServerAttachment)(nil)).Elem()
}

func (i ServerGroupServerAttachmentArray) ToServerGroupServerAttachmentArrayOutput() ServerGroupServerAttachmentArrayOutput {
	return i.ToServerGroupServerAttachmentArrayOutputWithContext(context.Background())
}

func (i ServerGroupServerAttachmentArray) ToServerGroupServerAttachmentArrayOutputWithContext(ctx context.Context) ServerGroupServerAttachmentArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerGroupServerAttachmentArrayOutput)
}

func (i ServerGroupServerAttachmentArray) ToOutput(ctx context.Context) pulumix.Output[[]*ServerGroupServerAttachment] {
	return pulumix.Output[[]*ServerGroupServerAttachment]{
		OutputState: i.ToServerGroupServerAttachmentArrayOutputWithContext(ctx).OutputState,
	}
}

// ServerGroupServerAttachmentMapInput is an input type that accepts ServerGroupServerAttachmentMap and ServerGroupServerAttachmentMapOutput values.
// You can construct a concrete instance of `ServerGroupServerAttachmentMapInput` via:
//
//	ServerGroupServerAttachmentMap{ "key": ServerGroupServerAttachmentArgs{...} }
type ServerGroupServerAttachmentMapInput interface {
	pulumi.Input

	ToServerGroupServerAttachmentMapOutput() ServerGroupServerAttachmentMapOutput
	ToServerGroupServerAttachmentMapOutputWithContext(context.Context) ServerGroupServerAttachmentMapOutput
}

type ServerGroupServerAttachmentMap map[string]ServerGroupServerAttachmentInput

func (ServerGroupServerAttachmentMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerGroupServerAttachment)(nil)).Elem()
}

func (i ServerGroupServerAttachmentMap) ToServerGroupServerAttachmentMapOutput() ServerGroupServerAttachmentMapOutput {
	return i.ToServerGroupServerAttachmentMapOutputWithContext(context.Background())
}

func (i ServerGroupServerAttachmentMap) ToServerGroupServerAttachmentMapOutputWithContext(ctx context.Context) ServerGroupServerAttachmentMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(ServerGroupServerAttachmentMapOutput)
}

func (i ServerGroupServerAttachmentMap) ToOutput(ctx context.Context) pulumix.Output[map[string]*ServerGroupServerAttachment] {
	return pulumix.Output[map[string]*ServerGroupServerAttachment]{
		OutputState: i.ToServerGroupServerAttachmentMapOutputWithContext(ctx).OutputState,
	}
}

type ServerGroupServerAttachmentOutput struct{ *pulumi.OutputState }

func (ServerGroupServerAttachmentOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**ServerGroupServerAttachment)(nil)).Elem()
}

func (o ServerGroupServerAttachmentOutput) ToServerGroupServerAttachmentOutput() ServerGroupServerAttachmentOutput {
	return o
}

func (o ServerGroupServerAttachmentOutput) ToServerGroupServerAttachmentOutputWithContext(ctx context.Context) ServerGroupServerAttachmentOutput {
	return o
}

func (o ServerGroupServerAttachmentOutput) ToOutput(ctx context.Context) pulumix.Output[*ServerGroupServerAttachment] {
	return pulumix.Output[*ServerGroupServerAttachment]{
		OutputState: o.OutputState,
	}
}

// The description of the servers. The description must be 2 to 256 characters in length, and can contain letters, digits, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).
func (o ServerGroupServerAttachmentOutput) Description() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringPtrOutput { return v.Description }).(pulumi.StringPtrOutput)
}

// The port used by the backend server. Valid values: 1 to 65535.
func (o ServerGroupServerAttachmentOutput) Port() pulumi.IntOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.IntOutput { return v.Port }).(pulumi.IntOutput)
}

// The ID of the server group.
func (o ServerGroupServerAttachmentOutput) ServerGroupId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringOutput { return v.ServerGroupId }).(pulumi.StringOutput)
}

// The ID of the server.
// - If the server group type is Instance, set the ServerId parameter to the ID of an Elastic Compute Service (ECS) instance, an elastic network interface (ENI), or an elastic container instance. These backend servers are specified by Ecs, Eni, or Eci.
// - If the server group type is Ip, set the ServerId parameter to an IP address.
func (o ServerGroupServerAttachmentOutput) ServerId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringOutput { return v.ServerId }).(pulumi.StringOutput)
}

// The IP address of the server. If the server group type is Ip, set the ServerId parameter to an IP address.
func (o ServerGroupServerAttachmentOutput) ServerIp() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringOutput { return v.ServerIp }).(pulumi.StringOutput)
}

// The type of the backend server. Valid values: `Ecs`, `Eni`, `Eci`, `Ip`.
func (o ServerGroupServerAttachmentOutput) ServerType() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringOutput { return v.ServerType }).(pulumi.StringOutput)
}

// Status of the server.
func (o ServerGroupServerAttachmentOutput) Status() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringOutput { return v.Status }).(pulumi.StringOutput)
}

// The weight of the backend server. Valid values: 0 to 100. Default value: 100. If the weight of a backend server is set to 0, no requests are forwarded to the backend server.
func (o ServerGroupServerAttachmentOutput) Weight() pulumi.IntOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.IntOutput { return v.Weight }).(pulumi.IntOutput)
}

// The zoneId of the server.
func (o ServerGroupServerAttachmentOutput) ZoneId() pulumi.StringOutput {
	return o.ApplyT(func(v *ServerGroupServerAttachment) pulumi.StringOutput { return v.ZoneId }).(pulumi.StringOutput)
}

type ServerGroupServerAttachmentArrayOutput struct{ *pulumi.OutputState }

func (ServerGroupServerAttachmentArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*ServerGroupServerAttachment)(nil)).Elem()
}

func (o ServerGroupServerAttachmentArrayOutput) ToServerGroupServerAttachmentArrayOutput() ServerGroupServerAttachmentArrayOutput {
	return o
}

func (o ServerGroupServerAttachmentArrayOutput) ToServerGroupServerAttachmentArrayOutputWithContext(ctx context.Context) ServerGroupServerAttachmentArrayOutput {
	return o
}

func (o ServerGroupServerAttachmentArrayOutput) ToOutput(ctx context.Context) pulumix.Output[[]*ServerGroupServerAttachment] {
	return pulumix.Output[[]*ServerGroupServerAttachment]{
		OutputState: o.OutputState,
	}
}

func (o ServerGroupServerAttachmentArrayOutput) Index(i pulumi.IntInput) ServerGroupServerAttachmentOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *ServerGroupServerAttachment {
		return vs[0].([]*ServerGroupServerAttachment)[vs[1].(int)]
	}).(ServerGroupServerAttachmentOutput)
}

type ServerGroupServerAttachmentMapOutput struct{ *pulumi.OutputState }

func (ServerGroupServerAttachmentMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*ServerGroupServerAttachment)(nil)).Elem()
}

func (o ServerGroupServerAttachmentMapOutput) ToServerGroupServerAttachmentMapOutput() ServerGroupServerAttachmentMapOutput {
	return o
}

func (o ServerGroupServerAttachmentMapOutput) ToServerGroupServerAttachmentMapOutputWithContext(ctx context.Context) ServerGroupServerAttachmentMapOutput {
	return o
}

func (o ServerGroupServerAttachmentMapOutput) ToOutput(ctx context.Context) pulumix.Output[map[string]*ServerGroupServerAttachment] {
	return pulumix.Output[map[string]*ServerGroupServerAttachment]{
		OutputState: o.OutputState,
	}
}

func (o ServerGroupServerAttachmentMapOutput) MapIndex(k pulumi.StringInput) ServerGroupServerAttachmentOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *ServerGroupServerAttachment {
		return vs[0].(map[string]*ServerGroupServerAttachment)[vs[1].(string)]
	}).(ServerGroupServerAttachmentOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*ServerGroupServerAttachmentInput)(nil)).Elem(), &ServerGroupServerAttachment{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerGroupServerAttachmentArrayInput)(nil)).Elem(), ServerGroupServerAttachmentArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*ServerGroupServerAttachmentMapInput)(nil)).Elem(), ServerGroupServerAttachmentMap{})
	pulumi.RegisterOutputType(ServerGroupServerAttachmentOutput{})
	pulumi.RegisterOutputType(ServerGroupServerAttachmentArrayOutput{})
	pulumi.RegisterOutputType(ServerGroupServerAttachmentMapOutput{})
}
