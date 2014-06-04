---
layout: doc
---

{% for ns in site.data.api-doc.namespaces %}
## {{ ns.ns-name}} 
{% if ns.doc %}{{ ns.doc | markdownify}}{% endif %}
  {% for fn in ns.vars %}
###  {{ fn.name }} 
{% if fn.doc %}{{ fn.doc }}{% endif %}
[source]({{ fn.src-url }})

{% for arglist in fn.arglists %}
  * {{ arglist | join:", " }}
{% endfor %} {% comment %} arglist {% endcomment %}

{% endfor %} {% comment %} fn {% endcomment %}
{% endfor %} {% comment %} ns {% endcomment %}

