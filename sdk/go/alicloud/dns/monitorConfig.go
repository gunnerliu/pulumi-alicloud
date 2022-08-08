// Code generated by the Pulumi Terraform Bridge (tfgen) Tool DO NOT EDIT.
// *** WARNING: Do not edit by hand unless you're certain you know what you are doing! ***

package dns

import (
	"context"
	"reflect"

	"github.com/pkg/errors"
	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
)

// Provides a DNS Monitor Config resource.
//
// For information about DNS Monitor Config and how to use it, see [What is Monitor Config](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
//
// > **NOTE:** Available in v1.153.0+.
//
// ## Example Usage
//
// Basic Usage
//
// ```go
// package main
//
// import (
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/cms"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/dns"
// 	"github.com/pulumi/pulumi-alicloud/sdk/v3/go/alicloud/resourcemanager"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi"
// 	"github.com/pulumi/pulumi/sdk/v3/go/pulumi/config"
// )
//
// func main() {
// 	pulumi.Run(func(ctx *pulumi.Context) error {
// 		cfg := config.New(ctx, "")
// 		name := "tf-testacc"
// 		if param := cfg.Get("name"); param != "" {
// 			name = param
// 		}
// 		domainName := "your_domain_name"
// 		if param := cfg.Get("domainName"); param != "" {
// 			domainName = param
// 		}
// 		defaultResourceGroups, err := resourcemanager.GetResourceGroups(ctx, nil, nil)
// 		if err != nil {
// 			return err
// 		}
// 		defaultAlarmContactGroup, err := cms.NewAlarmContactGroup(ctx, "defaultAlarmContactGroup", &cms.AlarmContactGroupArgs{
// 			AlarmContactGroupName: pulumi.String(name),
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultGtmInstance, err := dns.NewGtmInstance(ctx, "defaultGtmInstance", &dns.GtmInstanceArgs{
// 			InstanceName:         pulumi.String(name),
// 			PaymentType:          pulumi.String("Subscription"),
// 			Period:               pulumi.Int(1),
// 			RenewalStatus:        pulumi.String("ManualRenewal"),
// 			PackageEdition:       pulumi.String("ultimate"),
// 			HealthCheckTaskCount: pulumi.Int(100),
// 			SmsNotificationCount: pulumi.Int(1000),
// 			PublicCnameMode:      pulumi.String("SYSTEM_ASSIGN"),
// 			Ttl:                  pulumi.Int(60),
// 			CnameType:            pulumi.String("PUBLIC"),
// 			ResourceGroupId:      pulumi.String(defaultResourceGroups.Groups[0].Id),
// 			AlertGroups: pulumi.StringArray{
// 				defaultAlarmContactGroup.AlarmContactGroupName,
// 			},
// 			PublicUserDomainName: pulumi.String(domainName),
// 			AlertConfigs: dns.GtmInstanceAlertConfigArray{
// 				&dns.GtmInstanceAlertConfigArgs{
// 					SmsNotice:      pulumi.Bool(true),
// 					NoticeType:     pulumi.String("ADDR_ALERT"),
// 					EmailNotice:    pulumi.Bool(true),
// 					DingtalkNotice: pulumi.Bool(true),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		defaultAddressPool, err := dns.NewAddressPool(ctx, "defaultAddressPool", &dns.AddressPoolArgs{
// 			AddressPoolName: pulumi.String(name),
// 			InstanceId:      defaultGtmInstance.ID(),
// 			LbaStrategy:     pulumi.String("RATIO"),
// 			Type:            pulumi.String("IPV4"),
// 			Addresses: dns.AddressPoolAddressArray{
// 				&dns.AddressPoolAddressArgs{
// 					AttributeInfo: pulumi.String("{\"lineCodeRectifyType\":\"RECTIFIED\",\"lineCodes\":[\"os_namerica_us\"]}"),
// 					Remark:        pulumi.String("address_remark"),
// 					Address:       pulumi.String("1.1.1.1"),
// 					Mode:          pulumi.String("SMART"),
// 					LbaWeight:     pulumi.Int(1),
// 				},
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		_, err = dns.NewMonitorConfig(ctx, "defaultMonitorConfig", &dns.MonitorConfigArgs{
// 			AddrPoolId:        defaultAddressPool.ID(),
// 			EvaluationCount:   pulumi.Int(1),
// 			Interval:          pulumi.Int(60),
// 			Timeout:           pulumi.Int(5000),
// 			ProtocolType:      pulumi.String("TCP"),
// 			MonitorExtendInfo: pulumi.String("{\"failureRate\"=50,\"port\"=80}"),
// 			IspCityNodes: dns.MonitorConfigIspCityNodeArray{
// 				CityCode: "503",
// 				IspCode:  "465",
// 			},
// 		})
// 		if err != nil {
// 			return err
// 		}
// 		return nil
// 	})
// }
// ```
//
// ## Import
//
// DNS Monitor Config can be imported using the id, e.g.
//
// ```sh
//  $ pulumi import alicloud:dns/monitorConfig:MonitorConfig example <id>
// ```
type MonitorConfig struct {
	pulumi.CustomResourceState

	// The ID of the address pool.
	AddrPoolId pulumi.StringOutput `pulumi:"addrPoolId"`
	// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
	EvaluationCount pulumi.IntOutput `pulumi:"evaluationCount"`
	// The health check interval. Unit: seconds. Valid values: `60`.
	Interval pulumi.IntOutput `pulumi:"interval"`
	// The Monitoring node. See the following `Block ispCityNode`.
	IspCityNodes MonitorConfigIspCityNodeArrayOutput `pulumi:"ispCityNodes"`
	// The lang.
	Lang pulumi.StringPtrOutput `pulumi:"lang"`
	// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
	MonitorExtendInfo pulumi.StringOutput `pulumi:"monitorExtendInfo"`
	// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
	ProtocolType pulumi.StringOutput `pulumi:"protocolType"`
	// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
	Timeout pulumi.IntOutput `pulumi:"timeout"`
}

// NewMonitorConfig registers a new resource with the given unique name, arguments, and options.
func NewMonitorConfig(ctx *pulumi.Context,
	name string, args *MonitorConfigArgs, opts ...pulumi.ResourceOption) (*MonitorConfig, error) {
	if args == nil {
		return nil, errors.New("missing one or more required arguments")
	}

	if args.AddrPoolId == nil {
		return nil, errors.New("invalid value for required argument 'AddrPoolId'")
	}
	if args.EvaluationCount == nil {
		return nil, errors.New("invalid value for required argument 'EvaluationCount'")
	}
	if args.Interval == nil {
		return nil, errors.New("invalid value for required argument 'Interval'")
	}
	if args.IspCityNodes == nil {
		return nil, errors.New("invalid value for required argument 'IspCityNodes'")
	}
	if args.MonitorExtendInfo == nil {
		return nil, errors.New("invalid value for required argument 'MonitorExtendInfo'")
	}
	if args.ProtocolType == nil {
		return nil, errors.New("invalid value for required argument 'ProtocolType'")
	}
	if args.Timeout == nil {
		return nil, errors.New("invalid value for required argument 'Timeout'")
	}
	var resource MonitorConfig
	err := ctx.RegisterResource("alicloud:dns/monitorConfig:MonitorConfig", name, args, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// GetMonitorConfig gets an existing MonitorConfig resource's state with the given name, ID, and optional
// state properties that are used to uniquely qualify the lookup (nil if not required).
func GetMonitorConfig(ctx *pulumi.Context,
	name string, id pulumi.IDInput, state *MonitorConfigState, opts ...pulumi.ResourceOption) (*MonitorConfig, error) {
	var resource MonitorConfig
	err := ctx.ReadResource("alicloud:dns/monitorConfig:MonitorConfig", name, id, state, &resource, opts...)
	if err != nil {
		return nil, err
	}
	return &resource, nil
}

// Input properties used for looking up and filtering MonitorConfig resources.
type monitorConfigState struct {
	// The ID of the address pool.
	AddrPoolId *string `pulumi:"addrPoolId"`
	// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
	EvaluationCount *int `pulumi:"evaluationCount"`
	// The health check interval. Unit: seconds. Valid values: `60`.
	Interval *int `pulumi:"interval"`
	// The Monitoring node. See the following `Block ispCityNode`.
	IspCityNodes []MonitorConfigIspCityNode `pulumi:"ispCityNodes"`
	// The lang.
	Lang *string `pulumi:"lang"`
	// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
	MonitorExtendInfo *string `pulumi:"monitorExtendInfo"`
	// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
	ProtocolType *string `pulumi:"protocolType"`
	// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
	Timeout *int `pulumi:"timeout"`
}

type MonitorConfigState struct {
	// The ID of the address pool.
	AddrPoolId pulumi.StringPtrInput
	// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
	EvaluationCount pulumi.IntPtrInput
	// The health check interval. Unit: seconds. Valid values: `60`.
	Interval pulumi.IntPtrInput
	// The Monitoring node. See the following `Block ispCityNode`.
	IspCityNodes MonitorConfigIspCityNodeArrayInput
	// The lang.
	Lang pulumi.StringPtrInput
	// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
	MonitorExtendInfo pulumi.StringPtrInput
	// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
	ProtocolType pulumi.StringPtrInput
	// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
	Timeout pulumi.IntPtrInput
}

func (MonitorConfigState) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorConfigState)(nil)).Elem()
}

type monitorConfigArgs struct {
	// The ID of the address pool.
	AddrPoolId string `pulumi:"addrPoolId"`
	// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
	EvaluationCount int `pulumi:"evaluationCount"`
	// The health check interval. Unit: seconds. Valid values: `60`.
	Interval int `pulumi:"interval"`
	// The Monitoring node. See the following `Block ispCityNode`.
	IspCityNodes []MonitorConfigIspCityNode `pulumi:"ispCityNodes"`
	// The lang.
	Lang *string `pulumi:"lang"`
	// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
	MonitorExtendInfo string `pulumi:"monitorExtendInfo"`
	// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
	ProtocolType string `pulumi:"protocolType"`
	// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
	Timeout int `pulumi:"timeout"`
}

// The set of arguments for constructing a MonitorConfig resource.
type MonitorConfigArgs struct {
	// The ID of the address pool.
	AddrPoolId pulumi.StringInput
	// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
	EvaluationCount pulumi.IntInput
	// The health check interval. Unit: seconds. Valid values: `60`.
	Interval pulumi.IntInput
	// The Monitoring node. See the following `Block ispCityNode`.
	IspCityNodes MonitorConfigIspCityNodeArrayInput
	// The lang.
	Lang pulumi.StringPtrInput
	// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
	MonitorExtendInfo pulumi.StringInput
	// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
	ProtocolType pulumi.StringInput
	// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
	Timeout pulumi.IntInput
}

func (MonitorConfigArgs) ElementType() reflect.Type {
	return reflect.TypeOf((*monitorConfigArgs)(nil)).Elem()
}

type MonitorConfigInput interface {
	pulumi.Input

	ToMonitorConfigOutput() MonitorConfigOutput
	ToMonitorConfigOutputWithContext(ctx context.Context) MonitorConfigOutput
}

func (*MonitorConfig) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorConfig)(nil)).Elem()
}

func (i *MonitorConfig) ToMonitorConfigOutput() MonitorConfigOutput {
	return i.ToMonitorConfigOutputWithContext(context.Background())
}

func (i *MonitorConfig) ToMonitorConfigOutputWithContext(ctx context.Context) MonitorConfigOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorConfigOutput)
}

// MonitorConfigArrayInput is an input type that accepts MonitorConfigArray and MonitorConfigArrayOutput values.
// You can construct a concrete instance of `MonitorConfigArrayInput` via:
//
//          MonitorConfigArray{ MonitorConfigArgs{...} }
type MonitorConfigArrayInput interface {
	pulumi.Input

	ToMonitorConfigArrayOutput() MonitorConfigArrayOutput
	ToMonitorConfigArrayOutputWithContext(context.Context) MonitorConfigArrayOutput
}

type MonitorConfigArray []MonitorConfigInput

func (MonitorConfigArray) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorConfig)(nil)).Elem()
}

func (i MonitorConfigArray) ToMonitorConfigArrayOutput() MonitorConfigArrayOutput {
	return i.ToMonitorConfigArrayOutputWithContext(context.Background())
}

func (i MonitorConfigArray) ToMonitorConfigArrayOutputWithContext(ctx context.Context) MonitorConfigArrayOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorConfigArrayOutput)
}

// MonitorConfigMapInput is an input type that accepts MonitorConfigMap and MonitorConfigMapOutput values.
// You can construct a concrete instance of `MonitorConfigMapInput` via:
//
//          MonitorConfigMap{ "key": MonitorConfigArgs{...} }
type MonitorConfigMapInput interface {
	pulumi.Input

	ToMonitorConfigMapOutput() MonitorConfigMapOutput
	ToMonitorConfigMapOutputWithContext(context.Context) MonitorConfigMapOutput
}

type MonitorConfigMap map[string]MonitorConfigInput

func (MonitorConfigMap) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorConfig)(nil)).Elem()
}

func (i MonitorConfigMap) ToMonitorConfigMapOutput() MonitorConfigMapOutput {
	return i.ToMonitorConfigMapOutputWithContext(context.Background())
}

func (i MonitorConfigMap) ToMonitorConfigMapOutputWithContext(ctx context.Context) MonitorConfigMapOutput {
	return pulumi.ToOutputWithContext(ctx, i).(MonitorConfigMapOutput)
}

type MonitorConfigOutput struct{ *pulumi.OutputState }

func (MonitorConfigOutput) ElementType() reflect.Type {
	return reflect.TypeOf((**MonitorConfig)(nil)).Elem()
}

func (o MonitorConfigOutput) ToMonitorConfigOutput() MonitorConfigOutput {
	return o
}

func (o MonitorConfigOutput) ToMonitorConfigOutputWithContext(ctx context.Context) MonitorConfigOutput {
	return o
}

// The ID of the address pool.
func (o MonitorConfigOutput) AddrPoolId() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.StringOutput { return v.AddrPoolId }).(pulumi.StringOutput)
}

// The number of consecutive times of failed health check attempts. Valid values: `1`, `2`, `3`.
func (o MonitorConfigOutput) EvaluationCount() pulumi.IntOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.IntOutput { return v.EvaluationCount }).(pulumi.IntOutput)
}

// The health check interval. Unit: seconds. Valid values: `60`.
func (o MonitorConfigOutput) Interval() pulumi.IntOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.IntOutput { return v.Interval }).(pulumi.IntOutput)
}

// The Monitoring node. See the following `Block ispCityNode`.
func (o MonitorConfigOutput) IspCityNodes() MonitorConfigIspCityNodeArrayOutput {
	return o.ApplyT(func(v *MonitorConfig) MonitorConfigIspCityNodeArrayOutput { return v.IspCityNodes }).(MonitorConfigIspCityNodeArrayOutput)
}

// The lang.
func (o MonitorConfigOutput) Lang() pulumi.StringPtrOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.StringPtrOutput { return v.Lang }).(pulumi.StringPtrOutput)
}

// The extended information. This value follows the json format. For more details, see the [description of MonitorExtendInfo in the Request parameters table for details](https://www.alibabacloud.com/help/en/doc-detail/198064.html).
func (o MonitorConfigOutput) MonitorExtendInfo() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.StringOutput { return v.MonitorExtendInfo }).(pulumi.StringOutput)
}

// The health check protocol. Valid values: `HTTP`, `HTTPS`, `PING`, `TCP`.
func (o MonitorConfigOutput) ProtocolType() pulumi.StringOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.StringOutput { return v.ProtocolType }).(pulumi.StringOutput)
}

// The timeout period. Unit: milliseconds. Valid values: `2000`, `3000`, `5000`, `10000`.
func (o MonitorConfigOutput) Timeout() pulumi.IntOutput {
	return o.ApplyT(func(v *MonitorConfig) pulumi.IntOutput { return v.Timeout }).(pulumi.IntOutput)
}

type MonitorConfigArrayOutput struct{ *pulumi.OutputState }

func (MonitorConfigArrayOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*[]*MonitorConfig)(nil)).Elem()
}

func (o MonitorConfigArrayOutput) ToMonitorConfigArrayOutput() MonitorConfigArrayOutput {
	return o
}

func (o MonitorConfigArrayOutput) ToMonitorConfigArrayOutputWithContext(ctx context.Context) MonitorConfigArrayOutput {
	return o
}

func (o MonitorConfigArrayOutput) Index(i pulumi.IntInput) MonitorConfigOutput {
	return pulumi.All(o, i).ApplyT(func(vs []interface{}) *MonitorConfig {
		return vs[0].([]*MonitorConfig)[vs[1].(int)]
	}).(MonitorConfigOutput)
}

type MonitorConfigMapOutput struct{ *pulumi.OutputState }

func (MonitorConfigMapOutput) ElementType() reflect.Type {
	return reflect.TypeOf((*map[string]*MonitorConfig)(nil)).Elem()
}

func (o MonitorConfigMapOutput) ToMonitorConfigMapOutput() MonitorConfigMapOutput {
	return o
}

func (o MonitorConfigMapOutput) ToMonitorConfigMapOutputWithContext(ctx context.Context) MonitorConfigMapOutput {
	return o
}

func (o MonitorConfigMapOutput) MapIndex(k pulumi.StringInput) MonitorConfigOutput {
	return pulumi.All(o, k).ApplyT(func(vs []interface{}) *MonitorConfig {
		return vs[0].(map[string]*MonitorConfig)[vs[1].(string)]
	}).(MonitorConfigOutput)
}

func init() {
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorConfigInput)(nil)).Elem(), &MonitorConfig{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorConfigArrayInput)(nil)).Elem(), MonitorConfigArray{})
	pulumi.RegisterInputType(reflect.TypeOf((*MonitorConfigMapInput)(nil)).Elem(), MonitorConfigMap{})
	pulumi.RegisterOutputType(MonitorConfigOutput{})
	pulumi.RegisterOutputType(MonitorConfigArrayOutput{})
	pulumi.RegisterOutputType(MonitorConfigMapOutput{})
}
